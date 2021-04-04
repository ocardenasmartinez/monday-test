package cl.test.serviceexample.configurations;

import cl.test.serviceexample.services.Service;
import cl.test.serviceexample.services.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Service getService() {
        return new ServiceImpl();
    }

}
