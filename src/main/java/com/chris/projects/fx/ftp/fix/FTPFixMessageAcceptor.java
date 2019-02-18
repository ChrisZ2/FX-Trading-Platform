package com.chris.projects.fx.ftp.fix;

import quickfix.MessageCracker;
import quickfix.SessionID;
import quickfix.fix44.NewOrderSingle;


public class FTPFixMessageAcceptor extends MessageCracker {

    @Handler
    public void onMessage(NewOrderSingle message, SessionID sessionID) {
        //handle message
    }

}
