package com.chris.projects.fx.ftp.util.traslator;

import com.chris.projects.fx.ftp.entity.request.Request;
import quickfix.Message;

public interface FixToRequestTranslator {

    Request translateFixToRequst(Message message);
}
