package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate license plate number using regex
public class ValidateLicensePlate {
    public static void main(String[] args) {
        // Create a regex variable to store regex for license plate number
        String regex = "^[A-Z]{2}\\d{4}$";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter License Plate: ");
        String s = input.next();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        if(matcher.matches()) {
            System.out.println("Valid plate number");
        } else {
            System.out.println("Invalid plate number");
        }

        input.close();
    }
}
// Sample Output ->
// Enter License Plate: MH1234
// Valid plate number

// Enter License Plate: MH123
// Invalid plate number

// Enter License Plate: MH12345
// Invalid plate number