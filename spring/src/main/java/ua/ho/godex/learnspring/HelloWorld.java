package ua.ho.godex.learnspring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

import javax.annotation.PreDestroy;

public class HelloWorld implements DisposableBean,InitializingBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
