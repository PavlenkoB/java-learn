package ua.ho.godex.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Locale;

@SpringBootApplication
@PropertySource("classpath:application.yml")
public class MainApp implements ApplicationRunner {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment env = context.getEnvironment();
        String key = "spring.profiles.active";
        boolean containsFoo = env.containsProperty(key);
        System.out.println(context.getMessage("greeting", null, Locale.FRANCE));
    }
}