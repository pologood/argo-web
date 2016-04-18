package com.argo.web.filter;

import com.argo.security.exception.CookieExpiredException;
import com.argo.web.CSRFToken;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.util.WebUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dengyaming on 16/4/18.
 */
public class CSRFTokenValidateFilter implements Filter {


    public static final String XMLHTTP_REQUEST = "XMLHttpRequest";
    public static final String X_REQUESTED_WITH = "X-Requested-With";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String X_CSRFTOKEN = "X-CSRFToken";
    public static final String CSRF_ = "_csrf_";
    public static final String CSRF_1 = "_csrf_";
    public static final String FILTERS = "filters";

    private FilterConfig config = null;
    private String[] filterUrls = null;

    /* (non-Javadoc)
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {

    }

    protected boolean isAjax(HttpServletRequest request){
        return XMLHTTP_REQUEST.equalsIgnoreCase(request.getHeader(X_REQUESTED_WITH));
    }

    /* (non-Javadoc)
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        String method = httpRequest.getMethod();
        if(POST.equalsIgnoreCase(method) || PUT.equalsIgnoreCase(method)){
            if(!this.isUrlFiltered(httpRequest)){
                String formToken = httpRequest.getParameter(CSRF_);
                if (StringUtils.isBlank(formToken)){
                    formToken = httpRequest.getHeader(X_CSRFTOKEN);
                }

                Cookie clientToken = WebUtils.getCookie(httpRequest, CSRF_1);
                if(clientToken==null || StringUtils.isBlank(formToken)){
                    outputErrorResponse(403, httpServletResponse, httpRequest);
                }else {
                    try {
                        boolean valid = CSRFToken.validate(clientToken, formToken);
                        if (!valid) {
                            outputErrorResponse(403, httpServletResponse, httpRequest);
                        }
                    } catch (CookieExpiredException e) {
                        outputErrorResponse(408, httpServletResponse, httpRequest);
                    }
                }
            }
        }

        chain.doFilter(request, response);
    }

    /**
     * 输出验证错误
     * @param status
     * @param response
     * @param httpRequest
     * @throws IOException
     * @throws ServletException
     */
    private void outputErrorResponse(int status, HttpServletResponse response, HttpServletRequest httpRequest) throws IOException, ServletException {
        if(this.isAjax(httpRequest)){
            HttpServletResponse resp = response;
            resp.setStatus(status);
            resp.getWriter().write("{'error':'You are not allowed to execute this action'}");
            resp.setContentType("application/json; charset=UTF-8");
            resp.addHeader("Cache-Control", "no-store");
            resp.addHeader("Pragma", "no-cache");
            resp.getWriter().flush();
            resp.getWriter().close();
            return;
        }else{

            HttpServletResponse resp = response;
            resp.setStatus(status);
            throw new ServletException("You are not allowed to execute this action.");

        }
    }

    /**
     * URL是否需要过滤掉.
     * @param request
     * @return boolean
     */
    private boolean isUrlFiltered(HttpServletRequest request){
        if(this.filterUrls==null){
            return false;
        }
        String url = request.getRequestURI();
        url = url.replace(request.getContextPath(), "");
        url = url.trim().toLowerCase();
        for(String item : this.filterUrls){
            if(url.startsWith(item.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        if(this.config!=null){
            String value = this.config.getInitParameter(FILTERS);
            filterUrls = StringUtils.split(value, ",");
        }
    }

}
