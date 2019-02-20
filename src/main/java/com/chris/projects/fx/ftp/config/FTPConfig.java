package com.chris.projects.fx.ftp.config;

import com.chris.projects.fx.ftp.core.SpotOrderBookService;
import com.chris.projects.fx.ftp.core.SpotOrderController;
import com.chris.projects.fx.ftp.core.SpotOrderProcessor;
import com.chris.projects.fx.ftp.fix.FixSender;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "ftp")
public class FTPConfig {

    @Bean
    public SpotOrderController spotOrderController(FixSender ftpFixSender) {
        return new SpotOrderController(ftpFixSender);
    }

    @Bean
    public SpotOrderProcessor spotOrderProcessor(SpotOrderController spotOrderController) {
        return new SpotOrderProcessor(spotOrderController);
    }

    @Bean
    public SpotOrderBookService spotOrderBookService(SpotOrderProcessor spotOrderProcessor) {
        return new SpotOrderBookService(spotOrderProcessor);
    }
}
