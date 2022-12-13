package com.perscholas.lab._4_reading_a_string_from_the_console_scanner;
//Lab 303.2.2 Reading a String From the Console

import java.util.Scanner;

public class Example1ReadingStringFromConsole {
    /* We will learn how to prompt the user to input
     * a string and then read the string from console input.
     * When you are developing console applications using Java,
     * you must read input from users through the console.
     * To read a string from Console as input in Java applications,
     * you can use the Scanner class along with the System.in.
     *
     * System.in creates a standard input stream that is already open
     * and ready to supply input data. The scanner is a simple text
     * scanner that can parse primitive types and strings using regular
     * expressions. So, passing System.in to Scanner allows us to parse
     * or read strings from the standard input stream, which is the console.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three words separated by spaces: ");

        String s1 = keyboard.next();
        String s2 = keyboard.next();
        String s3 = keyboard.next();

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        /* Enter three words separated by spaces: Hello Java Learners
         *      s1 is Hello
         *      s2 is Java
         *      s3 is Learners
         */

        /* When the program is run, the execution waits after printing
         * “Enter three words separated by spaces:“, where the user
         * would enter a string something like “hello world” as shown
         * in the following console window.
         */


    }
}
