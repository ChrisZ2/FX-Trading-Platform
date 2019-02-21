package com.chris.projects.fx.ftp.config;

import com.chris.projects.fx.ftp.core.SpotOrderBookService;
import com.chris.projects.fx.ftp.fix.FTPFixMessageReceiver;
import com.chris.projects.fx.ftp.fix.FTPFixMessageSender;
import com.chris.projects.fx.ftp.fix.FixApplication;
import com.chris.projects.fx.ftp.fix.FixSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import quickfix.MessageCracker;

@Configuration
public class FTPFixConfig {

    private static final Logger LOG = LoggerFactory.getLogger(FTPFixConfig.class);

    @Bean
    public FTPFixProperties ftpFixProperties() {
        LOG.info("Initialize ftpFixProperties");
        return new FTPFixProperties();
    }

    @Bean
    public FixSender ftpFixSender(FTPFixProperties ftpFixProperties) {
        LOG.info("Initialize FixSender");
        return new FTPFixMessageSender(ftpFixProperties.getSenderCompId(), ftpFixProperties.getTargetCompId());
    }

    @Bean
    @DependsOn("spotOrderBookService")
    public MessageCracker ftpFixMessageReceiver(SpotOrderBookService orderBookService){
        LOG.info("Initialize MessageCracker");
        return new FTPFixMessageReceiver(orderBookService);
    }

    @Bean
    public FixApplication ftpFixApplication(MessageCracker ftpFixMessageReceiver) {
        LOG.info("Initialize FixApplication");
        return new FixApplication(ftpFixMessageReceiver);
    }

}
