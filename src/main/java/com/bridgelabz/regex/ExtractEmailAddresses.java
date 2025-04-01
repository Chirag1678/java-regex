package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to extract all email addresses from a string using regex
public class ExtractEmailAddresses {
    public static void main(String[] args) {
        // Regex string to store email regex
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        System.out.println("Email addresses: ");
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: Contact us at support@example.com and info@company.org"
// Email addresses:
// support@example.com
// info@company.org