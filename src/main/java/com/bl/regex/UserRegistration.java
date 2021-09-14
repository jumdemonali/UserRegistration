package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        String input = "Mona";
        String reqex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(reqex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
