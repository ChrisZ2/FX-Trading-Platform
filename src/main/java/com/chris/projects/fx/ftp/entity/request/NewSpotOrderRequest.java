package com.chris.projects.fx.ftp.entity.request;

import com.chris.projects.fx.ftp.entity.order.OrderType;

import java.math.BigDecimal;

public class NewSpotOrderRequest extends Request{

    private String clOrderId;
    private long timeStamp;
    private String symbol;
    private BigDecimal orderAmt;
    private String dealtCcy;
    private double price;
    private OrderType orderType;

    public NewSpotOrderRequest(String orderId) {
        super(orderId);
    }
}
