package com.argo.web;

import com.argo.yaml.YamlMap;
import com.argo.yaml.YamlTemplate;

import java.io.IOException;
import java.util.Map;

/**
 * Created by yamingd on 9/9/15.
 */
public class WebConfig {

    private static final String defaultConfName = "web.yaml";

    public static WebConfig instance = null;

    /**
     * 加载配置信息
     * @throws IOException
     */
    public synchronized static void load() throws IOException {
        load(defaultConfName);
    }

    /**
     * 加载配置信息
     * @throws IOException
     */
    public synchronized static void load(String confName) throws IOException {
        if (instance != null){
            return;
        }
        WebConfig.instance = YamlTemplate.load(WebConfig.class, confName);
    }


    private String id;
    private String domain;
    private String assets;
    private String title;
    private String name;
    private String login;
    private String denied;
    private String logout;
    private Boolean anonymous;
    private String attachmentview;
    private String frontEndDomain;

    private Integer captchaLen = 4;

    /**
     * 静态文件访问域名
     */
    private String cdn;

    private Map ext;

    private YamlMap extra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDenied() {
        return denied;
    }

    public void setDenied(String denied) {
        this.denied = denied;
    }

    public String getLogout() {
        return logout;
    }

    public void setLogout(String logout) {
        this.logout = logout;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public String getAttachmentview() {
        return attachmentview;
    }

    public void setAttachmentview(String attachmentview) {
        this.attachmentview = attachmentview;
    }

    public Map getExt() {
        return ext;
    }

    public void setExt(Map ext) {
        this.ext = ext;
        if (null != ext){
            extra = new YamlMap(ext);
        }
    }

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    public YamlMap getExtra() {
        return extra;
    }

    public String getFrontEndDomain() {
        return frontEndDomain;
    }

    public void setFrontEndDomain(String frontEndDomain) {
        this.frontEndDomain = frontEndDomain;
    }

    public Integer getCaptchaLen() {
        return captchaLen;
    }

    public void setCaptchaLen(Integer captchaLen) {
        this.captchaLen = captchaLen;
    }
}
