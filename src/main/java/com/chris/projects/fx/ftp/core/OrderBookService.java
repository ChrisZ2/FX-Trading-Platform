package com.chris.projects.fx.ftp.core;

public interface OrderBookService {

    void onOrderReceived();
    void onOrderCancel();
    void onOrderAmend();

}
