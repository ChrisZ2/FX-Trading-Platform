package com.chris.projects.fx.ftp.entity;

public class SpotOrder extends Order{
    private double filledAmt;
    private OrderStatus orderStatu;

    public SpotOrder(String orderId, String cloId, String symbol, String dealtCcy, double price, double orderAmt, long timeStamp) {
        super(orderId, cloId, symbol, dealtCcy, price, orderAmt, timeStamp);
        this.filledAmt = 0.0;
        this.orderStatu = OrderStatus.RECEIVED;
    }

    public SpotOrder(String orderId, String cloId, String symbol, String dealtCcy, double price, double orderAmt, long timeStamp, double filledAmt, OrderStatus orderStatu) {
        super(orderId, cloId, symbol, dealtCcy, price, orderAmt, timeStamp);
        this.filledAmt = filledAmt;
        this.orderStatu = orderStatu;
    }

    public double getFilledAmt() {
        return filledAmt;
    }

    public OrderStatus getOrderStatu() {
        return orderStatu;
    }
}
