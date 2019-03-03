package com.chris.projects.fx.ftp.core;

public class SpotOrderBookService implements OrderBookService {

    private OrderProcessor spotOrderProcessor;

    public SpotOrderBookService(OrderProcessor spotOrderProcessor) {
        this.spotOrderProcessor = spotOrderProcessor;
    }

    @Override
    public void onOrderReceived() {

    }

    @Override
    public void onOrderCancel() {

    }

    @Override
    public void onOrderAmend() {

    }

}
