package com.chris.projects.fx.ftp.util;

import org.springframework.core.annotation.Order;
import quickfix.Message;

public interface OrderFixTranlator {

    Message transalteOrderToFix(Order order);

    Order transalteFixToOrder(Message message);
}
