package com.chris.projects.fx.ftp.fix;

import quickfix.Message;

public interface FixSender {

    boolean send(Message message, String senderCompId, String targetCompId);
}
