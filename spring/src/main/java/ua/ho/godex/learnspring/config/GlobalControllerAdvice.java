package ua.ho.godex.learnspring.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import ua.ho.godex.learnspring.controller.DeveloperController;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.on;

@ControllerAdvice
@Slf4j
public class GlobalControllerAdvice {
    @InitBinder
    public void dataBinding(WebDataBinder binder) {
        UriComponents readDeveloper = MvcUriComponentsBuilder.fromMethodCall(on(DeveloperController.class).readDeveloper(3L)).buildAndExpand(3);
        String s = readDeveloper.toString();
        log.info("Binding name=" + s);

//        System.out.printf("Binding name=%s FieldMarkerPrefix=%s\n",binder.getObjectName(),binder.getClass().getSimpleName());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, true));
    }

    @ModelAttribute
    public void globalAttributes(Model model) {
        model.addAttribute("msg", "Welcome to My World!");
    }

    @ExceptionHandler(FileNotFoundException.class)
    public ModelAndView myError(Exception exception) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", exception);
        mav.setViewName("error");
        return mav;
    }
}
