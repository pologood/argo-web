package com.argo.web;

import com.argo.security.CookieCipher;
import com.argo.security.HashProvider;
import com.argo.security.SessionCookieHolder;
import com.argo.security.exception.CookieExpiredException;
import com.argo.security.exception.CookieInvalidException;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
public class CSRFToken {

    protected static Logger logger = LoggerFactory.getLogger(CSRFToken.class);

    public static final String CSRF = "_csrf_";

    private HttpServletRequest request;
    private HttpServletResponse response;
    private String token = null;

    public CSRFToken(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        token = ObjectUtils.toString(request.getAttribute(CSRF));
        if(StringUtils.isBlank(token)){
            token = request.getParameter(CSRF);
        }
    }

    /**
     * 输出csrf标签
     * @return
     */
    public String tag(){
       return getCsrfHtml();
    }

    private String _csrfHtml  = "<input type='hidden' name='_csrf_' value='%s' />";
    /**
     * 同时新开2个Form页面，旧页面的token会失效.
     * @return String HTML
     */
    private String getCsrfHtml(){
        String ct = String.format(this._csrfHtml, this.getToken());
        return ct;
    }

    /**
     *
     * @return String 随机字符串
     */
    public String getToken(){
        if(StringUtils.isBlank(token)){
            token = HashProvider.md5(System.currentTimeMillis() + RandomStringUtils.randomAlphanumeric(10));
            try {
                String encryptToken = CookieCipher.encrypt(CSRF, token);
                SessionCookieHolder.setCookie(response, CSRF, encryptToken);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return token;
    }

    /**
     * 检验客户端令牌是否正确
     * @param clientToken
     * @param formToken
     * @return
     */
    public static boolean validate(Cookie clientToken, String formToken) throws CookieExpiredException {
        try {

            String signedValue = CookieCipher.decodeSignedValue(CSRF, clientToken.getValue(), WebConfig.instance.getCsrfAge());
            return formToken.equalsIgnoreCase(signedValue);

        } catch (CookieInvalidException e) {
            return false;
        } catch (CookieExpiredException e) {
            throw e;
        }
    }
}
