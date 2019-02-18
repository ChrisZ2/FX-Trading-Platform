package com.chris.projects.fx.ftp.fix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.Session;
import quickfix.Message;

public class FTPFixMessageSender implements FixSender {

    private static final Logger LOG = LoggerFactory.getLogger(FTPFixMessageSender.class);
    private final String senderCompId;

    public FTPFixMessageSender(String senderCompId) {
        this.senderCompId = senderCompId;
    }

    @Override
    public boolean send(final Message message, final String targetCompId) {
        try {
            return Session.sendToTarget(message, targetCompId);
        }catch (Exception ex) {
            LOG.error("Unable to send fix message {}", message);
        }
        return false;
    }

}
