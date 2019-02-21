package com.chris.projects.fx.ftp.core;

public interface OrderProcessor<T> {
    void processReceivedOrder(T order);
    void processAmendedOrder(T order);
    void processCancelledOrder(T order);
}
