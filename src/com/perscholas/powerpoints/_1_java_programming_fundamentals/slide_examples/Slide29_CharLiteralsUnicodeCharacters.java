package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide29_CharLiteralsUnicodeCharacters {
    public static void main(String[] args) {
        /* We can specify char literals in Unicode representation
         */

        char ch = '\u0061'; // /u0061 represents ‘a’
        System.out.println(ch);
        //Output: a

        /* Unicode is not especially useful in console/terminal
         * applications because terminals do not render characters
         * outside the standard ASCII character set.
         *
         * Unicode's characters written into text files and displayed
         * by GUI (Graphical User Interface) applications can take
         * advantage of the full Unicode character set.
         */

    }
}
