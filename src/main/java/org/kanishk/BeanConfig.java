package org.kanishk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.kanishk")
public class BeanConfig {

    @Bean
    public BackendDeveloper backendDeveloper() {
        return new BackendDeveloper();
    }

    @Bean
    public FrontendDeveloper frontendDeveloper() {
        return new FrontendDeveloper();
    }

    @Bean
    public DevopsDeveloper devopsDeveloper() {
        return new DevopsDeveloper("Kubernetes");
    }
}
