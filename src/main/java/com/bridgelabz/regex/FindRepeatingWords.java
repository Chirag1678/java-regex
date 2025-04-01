package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to find and display repeating words in a string using regex
public class FindRepeatingWords {
    public static void main(String[] args) {
        // Regex to find repeating words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create a Pattern and Matcher object
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        System.out.println("Repeating Words:");
        while (matcher.find()) {
            System.out.print(matcher.group().split(" ")[0] + " ");
        }
        
        input.close();
    }
}
// Sample Output ->
// Enter String: This is is a repeated repeated list.
// Repeating Words: is repeated