package com.argo.web.protobuf;

/**
 * Created with IntelliJ IDEA.
 * User: Yaming
 * Date: 2014/10/25
 * Time: 12:49
 */
public class ProtobufResponse {

    private PAppResponse.Builder builder;

    public ProtobufResponse() {
        builder = PAppResponse.newBuilder();
        builder.setCode(200).setTotal(0);
    }

    public PAppResponse build() {
        return builder.build();
    }

    public PAppResponse.Builder getBuilder() {
        return builder;
    }
}
