package com.argo.web;

import java.io.Serializable;

public abstract class MvcResponse implements Serializable {

    protected String msg;
    protected Integer code;
    protected Integer total;

    public MvcResponse() {
        this.code = 200;
        this.msg = "";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
