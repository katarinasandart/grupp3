package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("/")
    public ModelAndView validator(@RequestParam String test){
        Validator validator = new Validator();
        if (validator.isNumber(test)) {
            return new ModelAndView("/").addObject("yes", "Det är siffror i texten!");
        }
        return new ModelAndView("/").addObject("no", "Det är inga siffror i texten");
    }
}
