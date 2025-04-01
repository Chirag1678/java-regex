package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate a social security number
public class ValidateSSN {
    public static void main(String[] args) {
        // Regex variable to store ssn regex
        String ssnRegex = "\\d{3}-\\d{2}-\\d{4}";

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create Pattern and Matcher objects
        Pattern pattern = Pattern.compile(ssnRegex);

        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            System.out.println("Valid SSN: " + matcher.group());
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: My SSN is 123-45-6789 and 987-65-4321
// Valid SSN: 123-45-6789
// Valid SSN: 987-65-4321