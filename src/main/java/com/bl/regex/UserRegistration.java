package com.bl.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        String input = "95031483";
        String phoneRegex = "^[A-Za-z0-9]{8,}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }

    }
}
