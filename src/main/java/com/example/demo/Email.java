package com.example.demo;


public class Email {
    public boolean isValidEmailAdress(String email) {
        if (email != null && !email.trim().isEmpty() && email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }
}
