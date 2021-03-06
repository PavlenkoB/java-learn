package ua.ho.godex.learnsspring.boot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class MyConfiguration {
    @ConfigurationProperties(prefix = "another")
    @Bean
    public AnotherComponent anotherComponent() {
        return new AnotherComponent();
    }
}
