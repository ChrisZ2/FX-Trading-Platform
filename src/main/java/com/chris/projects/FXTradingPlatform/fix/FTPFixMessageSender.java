package com.chris.projects.FXTradingPlatform.fix;

import quickfix.Session;
import quickfix.fix44.Message;

public class FTPFixMessageSender implements FixSender {

    private Session session;

    public FTPFixMessageSender(Session session) {
        this.session = session;
    }

    @Override
    public void send(Message message) {
        try {
            session.send(message);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
