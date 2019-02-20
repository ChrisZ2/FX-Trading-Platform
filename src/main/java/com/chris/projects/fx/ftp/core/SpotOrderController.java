package com.chris.projects.fx.ftp.core;

import com.chris.projects.fx.ftp.entity.SpotOrder;
import com.chris.projects.fx.ftp.fix.FixSender;

public class SpotOrderController implements OrderController<SpotOrder> {

    private FixSender ftpFixMessageSender;

    public SpotOrderController(FixSender ftpFixMessageSender) {
        this.ftpFixMessageSender = ftpFixMessageSender;
    }

    @Override
    public void onOrderAccepted(SpotOrder order) {

    }

    @Override
    public void onOrderFilled(SpotOrder order) {

    }

    @Override
    public void onOrderAmendAccepted(SpotOrder order) {

    }

    @Override
    public void onOrderExpired(SpotOrder order) {

    }

    @Override
    public void onOrderRejected(SpotOrder order) {

    }
}
