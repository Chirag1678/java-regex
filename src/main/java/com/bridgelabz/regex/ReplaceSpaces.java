package com.bridgelabz.regex;

import java.util.Scanner;

// Class to replace multiple spaces in a string by single space using regex
public class ReplaceSpaces {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // replace multiple spaces with single replace
        String spacesRemoved = s.replaceAll("\\s+", " ");

        // Display result
        System.out.println("String after removing extra spaces: " + spacesRemoved);

        input.close();
    }
}
// Sample Output ->
// Enter String: This    is    a    string    with    multiple    spaces
// String after removing extra spaces: This is a string with multiple spaces