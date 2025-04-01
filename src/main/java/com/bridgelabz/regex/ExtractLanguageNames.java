package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to extract programming language names from the string using regex
public class ExtractLanguageNames {
    public static void main(String[] args) {
        // Create an array of programming languages
        String[] languages = {"java", "python", "c", "c\\+\\+", "javascript", "swift", "kotlin", "c\\#", "php", "ruby", "Go"};

        // Construct regex pattern to match any language
        String languageRegex = "\\b(" + String.join("|", languages) + ")\\b";

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create objects of Pattern and Matcher
        Pattern pattern = Pattern.compile(languageRegex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(s);

        // find all programming languages
        System.out.print("Programming Languages: ");
        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: I know Java, Python, C++, JavaScript, and Swift.
// Programming Languages: Java Python C++ JavaScript Swift