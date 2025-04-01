package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate credit card number using generics
public class ValidateCreditCard {
    public static void main(String[] args) {
        // Regex variable to store credit card regex
        String ccRegex = "^[4-6][0-9]{15}$";

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a credit card number: ");
        String cc = input.nextLine();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(ccRegex);

        Matcher matcher = pattern.matcher(cc);

        if(matcher.matches()) {
            // Checks the first digit
            switch (cc.charAt(0)) {
                case '4':
                    System.out.println("Valid Visa Credit Card.");
                    break;
                case '5':
                    System.out.println("Valid Mastercard Credit Card.");
                    break;
                case '6':
                    System.out.println("Valid Rupay Credit Card.");
                    break;
            }
        } else {
            System.out.println("Invalid credit card.");
        }

        input.close();
    }
}
// Sample Output ->
// Enter a credit card number: 4123456789123456
// Valid Visa Credit Card.

// Enter a credit card number: 5123456789123456
// Valid Mastercard Credit Card.

// Enter a credit card number: 6123456789123456
// Valid Rupay Credit Card.

// Enter a credit card number: 7123456789123456
// Invalid credit card.