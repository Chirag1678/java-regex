package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to extract dates from a string in dd/mm/yyyy format
public class ExtractDates {
    public static void main(String[] args) {
        // Regex string to store regex for date
        String dateRegex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String s = input.nextLine();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(dateRegex);

        Matcher matcher = pattern.matcher(s);

        // condition to match regex
        System.out.print("Dates in dd/mm/yyyy format are: ");
        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        input.close();
    }
}
// Sample Output ->
// Enter String: The date of birth of John is 12/03/1990 and the date of birth of Jane is 23/05/1989
// Dates in dd/mm/yyyy format are: 12/03/1990 23/05/1989

// Enter String: The meeting is scheduled on 25/12/2021 and the event is on 31/12/2021
// Dates in dd/mm/yyyy format are: 25/12/2021 31/12/2021