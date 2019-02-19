package com.chris.projects.fx.ftp.core;

public interface OrderBookService {

    void onOrderReceived();
    void onOrderFillAccepted();
    void onOrderCancel();
    void onOrderAmend();
}
