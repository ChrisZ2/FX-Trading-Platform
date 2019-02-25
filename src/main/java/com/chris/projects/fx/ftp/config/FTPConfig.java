package com.chris.projects.fx.ftp.config;

import com.chris.projects.fx.ftp.core.SpotOrderBookService;
import com.chris.projects.fx.ftp.core.SpotOrderController;
import com.chris.projects.fx.ftp.core.SpotOrderProcessor;
import com.chris.projects.fx.ftp.fix.FixSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FTPFixConfig.class)
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


}
