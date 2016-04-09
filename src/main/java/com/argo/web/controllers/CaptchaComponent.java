package com.argo.web.controllers;

import com.argo.security.CookieCipher;
import com.argo.security.HashProvider;
import com.argo.security.SessionCookieHolder;
import com.argo.web.WebConfig;
import com.github.cage.Cage;
import com.github.cage.token.RandomTokenGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 验证码
 */
@Component
public class CaptchaComponent implements InitializingBean {

    public static CaptchaComponent instance;

    public static final String ID_COOKIE = "c";

    protected static Logger logger = LoggerFactory.getLogger(CaptchaComponent.class);

    private Cage cage = null;
    private void init() {
        Integer len = WebConfig.instance.getCaptchaLen();
        if (null == len){
            len = 4;
        }
        RandomTokenGenerator generator = new RandomTokenGenerator(new Random(), len);
        cage = new Cage(null, null, null, null, Cage.DEFAULT_COMPRESS_RATIO, generator, null);
    }

    /**
     * 读取Cookie Token
     * @param request
     * @return
     */
    public String getToken(HttpServletRequest request){
        Cookie cookie = SessionCookieHolder.getCookie(request, ID_COOKIE);
        if (cookie != null){
            return cookie.getValue();
        }
        return null;
    }

    /**
     * 校验验证码
     * @param request
     * @param token
     * @return
     */
    public boolean verifyToken(HttpServletRequest request, String token){
        String token0 = getToken(request);
        if (token0 == null){
            logger.error("Can't Get Token From Cookie. {}", request.getHeader("User-Agent"));
            return false;
        }
        String token1 = HashProvider.md5(token + CookieCipher.getCookieSecretSalt());
        boolean flag = token1.equalsIgnoreCase(token0);
        if (!flag){
            logger.error("Token is not correct. expect {}, but got {} ({})", token0, token1, token);
        }
        return flag;
    }

    /**
     * Generates a captcha token and stores it in the session.
     *
     * @param response
     *            where to store the captcha.
     */
    public String generateToken(HttpServletResponse response) {
        String token = cage.getTokenGenerator().next().toLowerCase();
        String token0 = HashProvider.md5(token + CookieCipher.getCookieSecretSalt());
        if (logger.isDebugEnabled()){
            logger.debug("captcha token: {} -> {}", token0, token);
        }
        SessionCookieHolder.setCookie(response, ID_COOKIE, token0);
        return token;
    }

    public void draw(String token, OutputStream outputStream) throws IOException {
        cage.draw(token, outputStream);
    }

    public String getFormat(){
        return cage.getFormat();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        instance = this;
        WebConfig.load();
        this.init();
    }
}
