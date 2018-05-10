package ua.ho.godex.learnspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@Slf4j
class FirstApplication {

    @PostConstruct
    void init() {
        log.info("FirstApplication init " + System.nanoTime());
    }

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to TutorialsPoint.Com";
    }
}
