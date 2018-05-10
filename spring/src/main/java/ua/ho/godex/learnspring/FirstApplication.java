package ua.ho.godex.learnspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FirstApplication {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to TutorialsPoint.Com";
    }
}
