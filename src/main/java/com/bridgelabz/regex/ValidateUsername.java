package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate a username using regex
public class ValidateUsername {
    public static void main(String[] args) {
        // Create a regex variable to store regex for username
        String regex ="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter username: ");
        String s = input.next();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        if(matcher.matches()) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        input.close();
    }
}
// Sample Output ->
// Enter username: john_doe
// Valid username

// Enter username: john
// Invalid username

// Enter username: john_doe123
// Valid username

// Enter username: 123john_doe
// Invalid username