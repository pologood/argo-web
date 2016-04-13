package com.argo.web;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

/**
 * 输出的JSON格式如下:
 * {
 *   "code": 响应业务状态编号,
 *   "msg": "响应业务提示",
 *   "version": 1,
 *   "total": 记录总数,
 *   "errors": [],
 *   "data": []
 * }
 * Created by yaming_deng on 14-8-20.
 */
public class JsonResponse<T> extends MvcResponse {

    protected List<T> data;

    /**
     * 构造函数
     */
    public JsonResponse() {
        super();
        this.data = Lists.newArrayList();
    }

    /**
     * 添加一个记录
     * @param o 记录
     * @return JsonResponse
     */
    public JsonResponse add(T o) {
        this.data.add(o);
        return this;
    }

    /**
     * 合并集合
     * @param list
     * @return
     */
    public JsonResponse addAll(Collection<T> list){
        this.data.addAll(list);
        return this;
    }

    /**
     * 返回数据集合
     * @return List
     */
    public List<T> getData() {
        return data;
    }


}
