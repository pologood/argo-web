package com.argo.web;

import com.google.common.collect.Lists;
import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by yaming_deng on 14-8-20.
 */
public class JsonResponse<T> extends MvcResponse {

    @Expose
    protected List<T> data;

    public JsonResponse() {
        super();
        this.data = Lists.newArrayList();
    }

    public JsonResponse add(T o) {
        this.data.add(o);
        return this;
    }

    public List<T> getData() {
        return data;
    }

}
