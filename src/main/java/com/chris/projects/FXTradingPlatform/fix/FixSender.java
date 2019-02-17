package com.chris.projects.FXTradingPlatform.fix;

import quickfix.Message;

public interface FixSender {

    void send(Message message);
}
