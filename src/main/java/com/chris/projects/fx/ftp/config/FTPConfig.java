package com.chris.projects.fx.ftp.config;

import com.chris.projects.fx.ftp.core.SpotOrderBookService;
import com.chris.projects.fx.ftp.core.SpotOrderController;
import com.chris.projects.fx.ftp.core.SpotOrderProcessor;
import com.chris.projects.fx.ftp.fix.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import quickfix.Application;
import quickfix.MessageCracker;

@Configuration
public class FTPConfig {

    private static final Logger LOG = LoggerFactory.getLogger(FTPConfig.class);

    @Bean
    public SpotOrderController spotOrderController(FixSender ftpFixSender) {
        LOG.info("Initialize spotOrderController");
        return new SpotOrderController(ftpFixSender);
    }

    @Bean
    public SpotOrderProcessor spotOrderProcessor(SpotOrderController spotOrderController) {
        LOG.info("Initialize spotOrderProcessor");
        return new SpotOrderProcessor(spotOrderController);
    }

    @Bean
    public SpotOrderBookService spotOrderBookService(SpotOrderProcessor spotOrderProcessor) {
        LOG.info("Initialize spotOrderBookService");
        return new SpotOrderBookService(spotOrderProcessor);
    }

    @Bean
    public FTPFixProperties ftpFixProperties() {
        LOG.info("Initialize ftpFixProperties");
        return new FTPFixProperties();
    }

    @Bean
    @DependsOn("ftpFixProperties")
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

    @Bean
    public FixSessionConnector fixSessionConnector(FTPFixProperties ftpFixProperties, Application fixApplication) {
        LOG.info("Creating fix session connector");
        FixSessionConnector fixSessionConnector = new FixSessionConnector(ftpFixProperties.getConfigFile(), ftpFixProperties.isAcceptor(), fixApplication, new FixConnectorFactoryImpl());
        fixSessionConnector.start();
        return fixSessionConnector;
    }

}
