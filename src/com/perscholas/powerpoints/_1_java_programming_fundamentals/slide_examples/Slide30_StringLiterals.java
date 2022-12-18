package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide30_StringLiterals {
    public static void main(String[] args) {
        /* A string in Java is an object, not a primitive.
         * Any sequence of characters within double quotes
         * is treated as a String literal:
         */
        String username = "popcorn";
        String password = "123456";

        /* String literals are first-class objects. They have
         * access to all the methods defined by the String class:
         * String literals are stored in the String Constant pool.
         */
        String name = "pop".concat("corn");


    }
}
