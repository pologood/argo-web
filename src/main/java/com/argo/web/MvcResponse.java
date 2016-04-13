package com.argo.web;

import java.io.Serializable;
import java.util.List;

public abstract class MvcResponse implements Serializable {

    /**
     * 返回业务提示或代号
     */
    protected String msg;

    /**
     * 返回业务状态编码
     */
    protected Integer code;

    /**
     * 记录总数
     */
    protected Integer total;

    /**
     * API版本号
     */
    protected Integer version = 1;

    /**
     * 服务端返回的错误代码
     */
    protected List<String> errors;

    public MvcResponse() {
        this.code = 200;
        this.msg = "";
    }

    public String getMsg() {
        return msg;
    }

    public MvcResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public MvcResponse setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public MvcResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public MvcResponse setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public MvcResponse setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }
}
