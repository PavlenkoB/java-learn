package ua.ho.godex.learnsspring.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@PropertySource("classpath:application.yml")
@EnableAutoConfiguration
@RestController
public class ExampleApp implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApp.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}