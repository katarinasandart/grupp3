package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class Palindrome {

    @GetMapping("/palindrome")
    private boolean isPalindrome(String s) {
        int length = s.length();

        if (length < 2) // If the string only has 1 char or is empty
            return true;
        else {
            // Check opposite ends of the string for equality
            if (s.charAt(0) != s.charAt(length - 1))
                return false;
                // Function call for string with the two ends snipped off
            else
                return isPalindrome(s.substring(1, length - 1));
        }
    }
}
