package com.chris.projects.fx.ftp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.chris.projects.fx.ftp.config.*")
@EnableAutoConfiguration
public class FxTradingPlatformApplication {

	public FxTradingPlatformApplication() {
		// empty
	}

	public static void main(String[] args) {

		SpringApplication.run(FxTradingPlatformApplication.class, args);
	}

}
