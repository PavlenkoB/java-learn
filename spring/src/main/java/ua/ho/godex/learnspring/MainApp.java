package ua.ho.godex.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
    }
}
