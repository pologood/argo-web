package com.argo.web.Interceptor;

import com.alibaba.fastjson.JSON;
import com.argo.security.SessionCookieHolder;
import com.argo.security.exception.*;
import com.argo.web.Enums;
import com.argo.web.JsonResponse;
import com.argo.web.WebConfig;
import com.argo.web.protobuf.ProtobufResponse;
import com.google.protobuf.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.argo.security.SessionCookieHolder.getAuthCookieId;

/**
 *
 */
public class ExceptionGlobalResolver implements HandlerExceptionResolver {

    public static final String XMLHTTP_REQUEST = "XMLHttpRequest";
    public static final String X_REQUESTED_WITH = "X-Requested-With";
    public static final String REDIRECT_TO = "redirectTo";

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        boolean isMobile = request.getHeader(HandlerPrepareAdapter.X_MOBILE) != null;
        if (isAjax(request)){
            return handleJsonRequest(request, response, ex);
        }else if(isMobile){
            String contentType = request.getHeader("Accept");
            if (Enums.PROTOBUF_VALUE.equalsIgnoreCase(contentType)) {
                this.handleMobileRequest(request, response, ex);
            }else{
                this.handleJsonRequest(request, response, ex);
            }
            return null;
        }else{
            return handleNormalRequest(request, response, ex);
        }
    }

    public void resolve(HttpServletRequest request, HttpServletResponse response, Exception ex){
        this.resolveException(request, response, null, ex);
    }

    private void handleMobileRequest(HttpServletRequest request, HttpServletResponse response, Exception ex){
        ProtobufResponse pb = new ProtobufResponse();
        if (ex instanceof UnauthorizedException){
            logger.error(ex.getMessage(), ex);
            UnauthorizedException exception = (UnauthorizedException)ex;
            pb.getBuilder().setCode(exception.getStatusCode()).setMsg("UserNotAuthorizationException");
            response.setStatus(exception.getStatusCode());
            writeProtobuf(request, response, pb.build());
        }else if (ex instanceof PermissionDeniedException){
            logger.error(ex.getMessage(), ex);
            PermissionDeniedException exception = (PermissionDeniedException)ex;
            pb.getBuilder().setCode(exception.getStatusCode()).setMsg("PermissionDeniedException");
            response.setStatus(exception.getStatusCode());
            writeProtobuf(request, response, pb.build());
        }else if (ex instanceof UserKickedOffException){
            logger.error(ex.getMessage(), ex);
            UserKickedOffException exception = (UserKickedOffException)ex;
            pb.getBuilder().setCode(exception.getStatusCode()).setMsg("UserKickedOffException");
            response.setStatus(200);
            writeProtobuf(request, response, pb.build());
        }
        else{
            String errorString = "Method:"+request.getMethod()+"请求错误:"+request.getRequestURL().toString()+",refererUrl:"+request.getHeader("Referer");
            logger.error(errorString, ex);
            pb.getBuilder().setCode(500).setMsg("Unexpected Error.");
            response.setStatus(500);
            writeProtobuf(request, response, pb.build());
        }
    }

    /**
     * 处理PC请求
     * @param request
     * @param response
     * @param ex
     * @return
     */
    private ModelAndView handleNormalRequest(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        if (ex instanceof UnauthorizedException){
            UnauthorizedException exception = (UnauthorizedException)ex;
            String loginUrl = WebConfig.instance.getDomain() +  WebConfig.instance.getLogin();
            try {
                response.setStatus(exception.getStatusCode());
                Object redirectTo = request.getAttribute(REDIRECT_TO);
                if (redirectTo != null){
                    String location = (String) redirectTo;
                    response.sendRedirect(WebConfig.instance.getDomain() + location);
                }else {
                    response.sendRedirect(loginUrl);
                }
                return null;
            } catch (IOException e) {
                logger.error("Redirect Error", e);
                return new ModelAndView("/500");
            }
        }if (ex instanceof CookieInvalidException || ex instanceof CookieExpiredException){
            SessionCookieHolder.removeCurrentUID(response, getAuthCookieId());
            String loginUrl = WebConfig.instance.getDomain() +  WebConfig.instance.getLogin();
            try {
                Object redirectTo = request.getAttribute(REDIRECT_TO);
                if (redirectTo != null){
                    String location = (String) redirectTo;
                    response.sendRedirect(WebConfig.instance.getDomain() + location);
                }else {
                    response.sendRedirect(loginUrl);
                }
                return null;
            } catch (IOException e) {
                logger.error("Redirect Error", e);
                return new ModelAndView("/500");
            }
        }else if (ex instanceof PermissionDeniedException){
            PermissionDeniedException exception = (PermissionDeniedException)ex;
            logger.warn("You do not have permission to access. " + request.getRequestURI());
            String url = WebConfig.instance.getDomain() +  WebConfig.instance.getDenied();
            response.setStatus(exception.getStatusCode());
            try {
                response.sendRedirect(url);
                return null;
            } catch (IOException e) {
                logger.error("Redirect Error", e);
                return new ModelAndView("/500");
            }
        }else{
            String errorString = "Method:"+request.getMethod()+"请求错误:"+request.getRequestURL().toString()+",refererUrl:"+request.getHeader("Referer");
            logger.error(errorString, ex);
            //response.setStatus(500);
            return new ModelAndView("/500");
        }
    }

    /**
     * 处理JSON请求
     * @param request
     * @param response
     * @param ex
     * @return
     */
    private ModelAndView handleJsonRequest(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        JsonResponse jsonResponse = new JsonResponse();
        if (ex instanceof UnauthorizedException){
            UnauthorizedException exception = (UnauthorizedException)ex;
            response.setStatus(exception.getStatusCode());
            String loginUrl = WebConfig.instance.getLogin();
            jsonResponse.setCode(exception.getStatusCode());
            jsonResponse.setMsg(loginUrl);
            writeJson(request, response, jsonResponse);
            return null;
        }else if (ex instanceof PermissionDeniedException){
            PermissionDeniedException exception = (PermissionDeniedException)ex;
            response.setStatus(exception.getStatusCode());
            jsonResponse.setCode(exception.getStatusCode());
            jsonResponse.setMsg(ex.getMessage());
            writeJson(request, response, jsonResponse);
            return null;
        }else{
            response.setStatus(500);
            String errorString = "Method:"+request.getMethod()+"请求错误:"+request.getRequestURL().toString()+",refererUrl:"+request.getHeader("Referer");
            logger.error(errorString, ex);
            jsonResponse.setCode(500);
            jsonResponse.setMsg(ex.getMessage());
            writeJson(request, response, jsonResponse);
            return null;
        }
    }

    private void writeJson(HttpServletRequest request, HttpServletResponse response, Object o){
        String json = JSON.toJSONString(o);
        response.setHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeProtobuf(HttpServletRequest request, HttpServletResponse response, Message o){
        response.setHeader("Content-Type", Enums.PROTOBUF_VALUE);
        try {
            response.getOutputStream().write(o.toByteArray());
            response.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected boolean isAjax(HttpServletRequest request){
        return XMLHTTP_REQUEST.equalsIgnoreCase(request.getHeader(X_REQUESTED_WITH));
    }
}
