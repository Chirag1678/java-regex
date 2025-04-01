package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to extract all capitalized words from a string using regex
public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        // Regex string to store regex for capitalized words
        String regex = "\\b[A-Z][a-z]*\\b"; // \\b ensures word boundary

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        System.out.print("Capitalized Words: ");
        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: The quick Brown Fox Jumps Over The Lazy Dog
// Capitalized Words: The Brown Fox Jumps Over The Lazy

// Enter String: The Eiffel Tower is in Paris and the Statue of Liberty is in New York.
// Capitalized Words: The Eiffel Tower Paris Statue Liberty New York