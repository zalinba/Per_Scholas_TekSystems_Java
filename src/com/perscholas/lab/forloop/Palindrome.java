package com.perscholas.lab.forloop;
//Lab 303.3.1 for loop

import java.util.Scanner;

public class Palindrome {
    /* we are going to see whether a number is a palindrome.
     * A for loop is used in this case. A palindrome number,
     * when reversed, represents the same number.
     */
    public static void main(String[] args) {
        String original, reverse = ""; //objects of String Class
        Scanner keyboard = new Scanner(System.in);
        System.out.println
                ("Enter a string/number to check if it is a palindrome");
        original = keyboard.nextLine();
        int length = original.length();

        for(int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse)){
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }

    }
}

