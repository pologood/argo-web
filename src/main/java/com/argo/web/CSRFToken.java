package com.argo.web;

import com.argo.security.HashProvider;
import com.argo.security.SessionCookieHolder;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: yamingdeng
 * Date: 13-12-22
 * Time: 下午3:21
 */
public class CSRFToken {

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
            token = HashProvider.md5(RandomStringUtils.randomAlphanumeric(10));
            SessionCookieHolder.setCookie(response, CSRF, token);
        }
        return token;
    }
}
