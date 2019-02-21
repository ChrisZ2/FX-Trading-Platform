package config;

import com.chris.projects.fx.ftp.config.FTPConfig;
import com.chris.projects.fx.ftp.config.FTPFixConfig;
import com.chris.projects.fx.ftp.fix.FixSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import stub.FTPFixSenderStub;

@Configuration
@Import({FTPFixConfig.class, FTPConfig.class  })
public class IntegrationTestConfig {

    @Bean
    @Primary
    FixSender ftpFixSenderStub() {
        return new FTPFixSenderStub();
    }

}
