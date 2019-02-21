package com.chris.projects.fx.ftp.util.traslator;

import com.chris.projects.fx.ftp.entity.response.Response;
import quickfix.Message;

public interface FixToResponseTranslator {

    Response translateFixToResponse(Message message);

}
