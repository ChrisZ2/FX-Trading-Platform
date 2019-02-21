package com.chris.projects.fx.ftp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix = "fix")
public class FTPFixProperties {

    private boolean isAcceptor;
    private String SenderCompId;
    private String TargetCompId;

    public boolean isAcceptor() {
        return isAcceptor;
    }

    public String getSenderCompId() {
        return SenderCompId;
    }

    public String getTargetCompId() {
        return TargetCompId;
    }

    public void setAcceptor(boolean acceptor) {
        isAcceptor = acceptor;
    }

    public void setSenderCompId(String senderCompId) {
        SenderCompId = senderCompId;
    }

    public void setTargetCompId(String targetCompId) {
        TargetCompId = targetCompId;
    }

}
