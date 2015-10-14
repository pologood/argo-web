package com.argo.web;

import com.argo.security.CookieCipher;
import com.argo.security.SessionCookieHolder;
import com.argo.security.UserIdentity;
import com.argo.security.exception.CookieExpiredException;
import com.argo.security.exception.CookieInvalidException;
import com.argo.security.exception.PermissionDeniedException;
import com.argo.security.exception.UnauthorizedException;
import com.argo.security.service.AuthorizationService;
import com.argo.web.Interceptor.ExceptionGlobalResolver;
import com.argo.web.protobuf.ProtobufResponse;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yamingdeng
 * Date: 13-12-15
 * Time: 下午8:12
 */
public abstract class MvcController {

    public static final String DEFAULT_MENU = "default";
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    protected ExceptionGlobalResolver exceptionGlobalResolver = new ExceptionGlobalResolver();

    @Autowired(required=false)
    private AuthorizationService authorizationService;

    /**
     * 获取当前用户
     * @param <T>
     * @return
     * @throws com.argo.security.exception.UnauthorizedException
     */
    @ModelAttribute
    public <T extends UserIdentity> T getCurrentUser() throws UnauthorizedException {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) ra).getRequest();
//        if (logger.isDebugEnabled()) {
//            logger.debug("getCurrentUser From Request");
//        }
        T o = (T) request.getAttribute("currentUser");
        if (this.needLogin() && (o == null)) {
            throw new UnauthorizedException();
        }
        return o;
    }

    /**
     * 检验Cookie
     * @param request
     * @param response
     * @return
     * @throws UnauthorizedException, CookieInvalidException, CookieExpiredException
     */
    public <T> T verifyCookie(HttpServletRequest request, HttpServletResponse response)
            throws UnauthorizedException, CookieInvalidException, CookieExpiredException {
        String currentUid = null;
        try {
            currentUid = SessionCookieHolder.getCurrentUID(request);
        } catch (UnauthorizedException e) {
            logger.debug("UserNotAuthorizationException currentUid="+currentUid);
        }
        if (null != authorizationService && StringUtils.isNotBlank(currentUid)){
            T baseUser = (T) this.authorizationService.verifyCookie(currentUid);
            return baseUser;
        }
        return null;
    }

    /**
     * 检查授权访问
     * @param url
     * @throws PermissionDeniedException
     */
    public void verifyAccess(String url) throws PermissionDeniedException {
        if (!this.needLogin()){
            return;
        }
        if (null != this.authorizationService){
            this.authorizationService.verifyAccess(url);
        }
    }

    public void init() throws Exception {

    }

    /**
     * 获取用户ip地址（在apache代理后需要从头文件中获取ip）
     *
     * @param request
     * @return
     */
    public static String getIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public String getMenu(){
        return DEFAULT_MENU;
    }

    public boolean needLogin() {
        return false;
    }

    /**
     * 记住当前用户
     * @param request
     * @param response
     * @param userId
     */
    public void rememberUser(HttpServletRequest request, HttpServletResponse response, Object userId) {
        String value = String.valueOf(userId);
        String name = SessionCookieHolder.getAuthCookieId();
        try {
            value = CookieCipher.encrypt(name, value);
            SessionCookieHolder.setCookie(response, name, value);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    public void rememberUser(HttpServletRequest request, HttpServletResponse response, String name, Object userId) {
        String value = String.valueOf(userId);
        try {
            value = CookieCipher.encrypt(name, value);
            SessionCookieHolder.setCookie(response, name, value);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * 注销当前用户
     * @param request
     * @param response
     */
    public void clearUser(HttpServletRequest request, HttpServletResponse response) {
        SessionCookieHolder.removeCurrentUID(response);
        request.removeAttribute("currentUser");
    }

    @ExceptionHandler(Exception.class)
    public void handleException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        exceptionGlobalResolver.resolve(request, response, ex);
    }

    protected void wrapError(BindingResult result, JsonResponse actResponse) {
        List<String> fields = Lists.newArrayList();
        for (FieldError error : result.getFieldErrors()) {
            fields.add(error.getDefaultMessage());
        }
        logger.error("Form Error: {}", result);
        actResponse.getData().add(fields);
        actResponse.setCode(6001);
    }

    protected void wrapError(BindingResult result, ProtobufResponse actResponse) throws Exception {
        for (FieldError error : result.getFieldErrors()) {
            actResponse.getBuilder().addErrors(error.getDefaultMessage());
        }
        logger.error("Form Error: {}", result);
        actResponse.getBuilder().setCode(6001);
    }
}
