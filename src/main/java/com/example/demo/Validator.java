package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;


public class Validator {

    @GetMapping("/test")
    public boolean isNumber(String s) {
        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
