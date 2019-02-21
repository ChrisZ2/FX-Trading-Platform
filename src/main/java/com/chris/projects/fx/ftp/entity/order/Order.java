package com.chris.projects.fx.ftp.entity.order;

public abstract class Order {
    private String orderId;
    private String cloId;
    private String symbol;
    private String dealtCcy;
    private double price;
    private double orderAmt;
    private long timeStamp;

    public Order(String orderId, String cloId, String symbol, String dealtCcy, double price, double orderAmt, long timeStamp) {
        this.orderId = orderId;
        this.cloId = cloId;
        this.symbol = symbol;
        this.dealtCcy = dealtCcy;
        this.price = price;
        this.orderAmt = orderAmt;
        this.timeStamp = timeStamp;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCloId() {
        return cloId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDealtCcy() {
        return dealtCcy;
    }

    public double getPrice() {
        return price;
    }

    public double getOrderAmt() {
        return orderAmt;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
