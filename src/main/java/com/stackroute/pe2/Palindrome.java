/*Write a Java method to Reverse the given input & Check if it is a Palindrome*/
package com.stackroute.pe2;

public class Palindrome {
    /*
    method to check for palindrome
     */
    public String reverse(String string) {
        int length = string.length();
        String reverse = "";
        //logic for reversing the string
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        //checking for palindrome
        if (string.equals(reverse))
           return "com.stackroute.pe2.Palindrome";
        else
            return "Not com.stackroute.pe2.Palindrome";

    }
}
