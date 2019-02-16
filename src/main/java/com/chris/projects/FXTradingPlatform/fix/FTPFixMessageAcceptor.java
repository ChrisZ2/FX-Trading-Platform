package com.chris.projects.FXTradingPlatform.fix;

import quickfix.MessageCracker;
import quickfix.SessionID;
import quickfix.fix44.NewOrderSingle;

public class FTPFixMessageAcceptor extends MessageCracker {

    @quickfix.MessageCracker.Handler
    public void onMessage(NewOrderSingle message, SessionID sessionID) {
        //handle message
    }

}
