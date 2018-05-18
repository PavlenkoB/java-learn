package ua.ho.godex.learnsspring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ua.ho.godex.learnsspring.boot.config.AnotherComponent;

@SpringBootApplication
//@PropertySource("classpath:application.yml")
//@EnableAutoConfiguration
@EnableWebMvc
@Controller
public class ExampleApp implements CommandLineRunner {

    @Autowired
    AnotherComponent anotherComponent;

    public static void main(String[] args) {
        SpringApplication.run(ExampleApp.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "index";
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("anotherComponent..." + anotherComponent.name);
    }
}