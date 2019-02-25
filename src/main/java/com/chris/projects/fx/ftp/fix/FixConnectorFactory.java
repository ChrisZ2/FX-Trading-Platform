package com.chris.projects.fx.ftp.fix;

import quickfix.*;

public interface FixConnectorFactory {

    Connector createSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory, SessionSettings sessionSettings,
                                   LogFactory logFactory, MessageFactory messageFactory) throws ConfigError;

    Connector createSocketInitiator(Application application, MessageStoreFactory messageStoreFactory, SessionSettings sessionSettings,
                                   LogFactory logFactory, MessageFactory messageFactory) throws ConfigError;
}
