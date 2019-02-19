package com.chris.projects.fx.ftp.core;

public interface OrderController {

    void onOrderAccepted();
    void onOrderFilled();
    void onOrderAmendAccepted();
    void onOrderExpired();
    void onOrderRejected();
}
