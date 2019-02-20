package com.chris.projects.fx.ftp.config;

import com.chris.projects.fx.ftp.fix.FTPFixMessageSender;
import com.chris.projects.fx.ftp.fix.FixSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FTPFixConfig {

    @Bean
    public FTPFixProperties ftpFixProperties() {
        return new FTPFixProperties();
    }

    @Bean
    public FixSender fxtpFixSender(FTPFixProperties ftpFixProperties) {
        return new FTPFixMessageSender(ftpFixProperties.getSenderCompId());
    }
}
