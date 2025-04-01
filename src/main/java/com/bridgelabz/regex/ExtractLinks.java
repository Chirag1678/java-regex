package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to extract links of web pages from a string using regex
public class ExtractLinks {
    public static void main(String[] args) {
        // Create a regex string to store link regex
        String linkRegex = "https?://(www\\.)?[a-z0-9]+\\.[a-z]{2,}";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(linkRegex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        System.out.print("Links are: ");
        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: Visit https://www.google.com and http://example.org for more info.
// Links are: https://www.google.com http://example.org 