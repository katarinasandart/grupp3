package com.example.demo;

public class Validator {
    public boolean isNumber(String s) {
        if (s.contains("[0-9]+")) {
            return true;
        }
        return false;
    }
}
