package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to replace bad words with **** using regex
public class ReplaceBadWords {
    public static void main(String[] args) {
        // List of bad words to censor
        String[] badWords = {"damn", "stupid", "shit", "rascal"};

        // Construct regex pattern to match any bad word (case-insensitive)
        String regex = String.join("|", badWords);

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Replace bad words with ****
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(s);

        String censoredSentence = matcher.replaceAll("****");

        // Display the result
        System.out.println("Censored sentence: " + censoredSentence);

        input.close();
    }
}
// Sample Output ->
// Enter String: This is a damn bad example with some stupid words.
// Censored sentence: This is a **** bad example with some **** words.