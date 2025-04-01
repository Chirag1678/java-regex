package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to match currency values from a string using regex
public class ExtractCurrencyValues {
    public static void main(String[] args) {
        // Regex variable to store currency regex
        String currencyRegex = "\\$?\\d+(\\.\\d{1,2})?";

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create Pattern and Matcher object
        Pattern pattern = Pattern.compile(currencyRegex);

        Matcher matcher = pattern.matcher(s);

        System.out.print("Currency Values: ");
        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: The price of the product is $12.50 and $10.00
// Currency Values: $12.50 $10.00

// Enter String: The total amount is $100.00 and $50
// Currency Values: $100.00 $50