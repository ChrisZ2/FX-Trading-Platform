package com.chris.projects.fx.ftp.core;

import com.chris.projects.fx.ftp.entity.order.SpotOrder;

public class SpotOrderProcessor implements OrderProcessor<SpotOrder>{

    private OrderController spotOrderController;

    public SpotOrderProcessor(OrderController spotOrderController) {
        this.spotOrderController = spotOrderController;
    }

    @Override
    public void processReceivedOrder(SpotOrder order) {

    }

    @Override
    public void processAmendedOrder(SpotOrder order) {

    }

    @Override
    public void processCancelledOrder(SpotOrder order) {

    }
}
