package com.argo.web;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public abstract class MvcResponse implements Serializable {

    @Expose
    protected String msg;

    @Expose
    protected Integer code;

    @Expose
    protected Integer total;

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
}
