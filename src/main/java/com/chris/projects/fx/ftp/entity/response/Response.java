package com.chris.projects.fx.ftp.entity.response;

public abstract class Response {

    private String orderId;

    public Response(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
