package com.chris.projects.FXTradingPlatform.fix;

import quickfix.fix44.Message;

public interface FixSender {

    void send(Message message);
}
