package com.bl.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first name");
            String firstName = scan.nextLine();
            System.out.println("Enter last name");
            String lastName = scan.nextLine();
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.firstNameValidation(firstName);
            userRegistration.lastNameValidation(lastName);
        }


    private void firstNameValidation(String firstName) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        System.out.println("Is valid: " + matcher.matches());
    }
    private void lastNameValidation(String lastName) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        System.out.println("Is valid: " + matcher.matches());
    }

}

