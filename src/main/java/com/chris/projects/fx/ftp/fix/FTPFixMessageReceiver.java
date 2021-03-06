package com.chris.projects.fx.ftp.fix;

import com.chris.projects.fx.ftp.core.OrderBookService;
import quickfix.MessageCracker;
import quickfix.SessionID;
import quickfix.fix44.NewOrderSingle;


public class FTPFixMessageReceiver extends MessageCracker {

    private OrderBookService orderBookService;

    public FTPFixMessageReceiver(OrderBookService orderBookService) {
        this.orderBookService = orderBookService;
    }

    @Handler
    public void onMessage(NewOrderSingle message, SessionID sessionID) {
        //handle message
    }

}
