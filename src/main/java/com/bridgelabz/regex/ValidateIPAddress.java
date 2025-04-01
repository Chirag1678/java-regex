package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate an ipv4 address using regex
public class ValidateIPAddress {
    public static void main(String[] args) {
        // Regex string to store regex for ip address
        String ipRegex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an IP address: ");
        String ip = input.nextLine();

        // Create an object of Pattern and Matcher
        Pattern pattern = Pattern.compile(ipRegex);

        Matcher matcher = pattern.matcher(ip);

        if(matcher.matches()) {
            System.out.println("Valid IP address.");
        } else {
            System.out.println("Invalid IP address.");
        }

        input.close();
    }
}
// Sample Output ->
// Enter an IP address: 192.168.1.0
// Valid IP address.

// Enter an IP address: 928.161.34.56
// Invalid IP address.