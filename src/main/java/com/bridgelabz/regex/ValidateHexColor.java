package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate a hex color code using regex
public class ValidateHexColor {
    public static void main(String[] args) {
        // Create a regex variable to store the regex for hex color code
        String regex = "^#[0-9A-Fa-f]{6}$";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Hex Color Code: ");
        String s = input.next();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        if(matcher.matches()) {
            System.out.println("Valid color code");
        } else {
            System.out.println("Invalid color code");
        }

        input.close();
    }
}
// Sample Output ->
// Enter Hex Color Code: #123abc
// Valid color code

// Enter Hex Color Code: #123abz
// Invalid color code

// Enter Hex Color Code: #123ab
// Invalid color code

// Enter Hex Color Code: #123abcd
// Invalid color code

// Enter Hex Color Code: #FFFFFF
// Valid color code