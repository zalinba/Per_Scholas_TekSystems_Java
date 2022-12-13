package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class contains {
    /* The contains() method checks whether the
     * specified string (sequence of characters)
     * is present in the string or not.
     */
    public static void main(String[] args) {
        String str1 = "Learn Java";
        Boolean result;

        //check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result);
        //output: true

        //checks if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);
        //output: false

        //checks if str1 contains ""
        result = str1.contains("");
        System.out.println(result);
        //output: true

    }
}
