package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class length {
    /* The length() method returns the length of the
     * string or It returns the count of the total number
     * of characters present in the String.
     */
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        //output:4

        System.out.println(str2.length());
        //output:0

        System.out.println("Java".length());
        //output:4

        System.out.println("Java\n".length());
        //output:5

        System.out.println("Learn Java".length());
        //output:10

    }
}
