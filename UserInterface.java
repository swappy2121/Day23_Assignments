package com.Bridgelabz;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
public class UserInterface {
    boolean validate(String str) throws CustomException {
    }

}

public class UserDetails {
    public static void main(String[] args) throws CustomException {
        // Welcome to lambda expression program......

        // Created a method to validate first name using lambda expression
        UserInterface validateFirstName = (firstName) -> {
            if (firstName.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
            return pattern.matcher(firstName).matches();
        };
        System.out.println(validateFirstName.validate("Swapnil"));


        // Created a method to validate last name using lambda expression
        UserInterface validateLastName = (lastName) -> {
            if (lastName.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
            return pattern.matcher(lastName).matches();
        };
        System.out.println(validateLastName.validate("Pawar"));


        // Created a method to validate email using lambda expression
        UserInterface validateEmail = (email) -> {
            if (email.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
            return pattern.matcher(email).matches();
        };
        System.out.println(validateEmail.validate("amol9.ag@gmail.com"));


        // Created a method to validate mobile number using lambda expression
        UserInterface validateMobNo = (mobNo) -> {
            if (mobNo.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
            return pattern.matcher(mobNo).matches();
        };
        System.out.println(validateMobNo.validate("8657169656"));


        // Created a method to validate password using lambda expression
        UserInterface validatePassword = (password) -> {
            if (password.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
            return pattern.matcher(password).matches();
        };
        System.out.println(validateMobNo.validate(""));
    }
}
