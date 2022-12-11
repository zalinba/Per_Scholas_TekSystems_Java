package com.perscholas.lab.stringmethods;
//Lab 303.2.1

public class compareStrings1 {
    /* The String class equals() method compares
     * the original content of the string. It
     * compares values of string for equality.
     * It is used in authentication (by equals() method)
     *
     * There are three ways to compare String in Java:
     * 1.	By Using equals() Method
     * 2.	By Using == Operator
     * 3.	By compareTo() Method
     */
    public static void main(String[] args) {
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = new String("PerScholas");
        String s4 = "Teksystem";

        System.out.println(s1.equals(s2));
        //output: true

        System.out.println(s1.equals(s3));
        //output: true

        System.out.println(s1.equals(s4));
        //output: false

        /* In the above code, two strings are compared to
         * using the equals() method of String class. The
         * result is printed as Boolean values, true or false.
         */

    }
}
