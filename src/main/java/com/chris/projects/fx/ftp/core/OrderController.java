package com.chris.projects.fx.ftp.core;

public interface OrderController<T> {

    void onOrderAccepted(T order);
    void onOrderFilled(T order);
    void onOrderAmendAccepted(T order);
    void onOrderExpired(T order);
    void onOrderRejected(T order);
}
