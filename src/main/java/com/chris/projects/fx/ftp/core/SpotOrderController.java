package com.chris.projects.fx.ftp.core;

import com.chris.projects.fx.ftp.fix.FixSender;

public class SpotOrderController implements OrderController {

    private FixSender ftpFixMessageSender;

    public SpotOrderController(FixSender ftpFixMessageSender) {
        this.ftpFixMessageSender = ftpFixMessageSender;
    }

    @Override
    public void onOrderAccepted() {

    }

    @Override
    public void onOrderFilled() {

    }

    @Override
    public void onOrderAmendAccepted() {

    }

    @Override
    public void onOrderExpired() {

    }

    @Override
    public void onOrderRejected() {

    }
}
