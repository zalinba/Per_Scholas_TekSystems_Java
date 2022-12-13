package com.perscholas.lab._4_reading_a_string_from_the_console_scanner;
//Lab 303.2.2 Reading a String From the Console

import java.util.Scanner;

public class Example2ReadingStringFromConsole {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a character: ");

        String s = keyboard.nextLine();
        char ch = s.charAt(0);

        System.out.println("The character entered is " + ch);

        //Enter a character: Perscholas The character entered is P


    }
}
