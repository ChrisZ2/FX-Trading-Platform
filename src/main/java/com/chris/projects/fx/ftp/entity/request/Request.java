package com.chris.projects.fx.ftp.entity.request;

public abstract class Request {

    private String orderId;

    public Request(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
