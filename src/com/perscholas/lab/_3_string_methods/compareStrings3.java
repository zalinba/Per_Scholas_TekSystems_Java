package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class compareStrings3 {
    /* The String class compareTo() method compares values
     * lexicographically. It returns an integer value that
     * describes if the first string is less than, equal to,
     * or greater than the second string.
     *
     * Return 0 if the string is the same as another
     * Return a negative integer if lexicographically less than another
     * Return a positive integer if lexicographically more than another
     *
     * Suppose s1 and s2 are two String objects. If:
     *      s1 == s2 : The method returns 0.
     *      s1 > s2 : The method returns a positive value.
     *      s1 < s2 : The method returns a negative value.
     *
     * It is used in reference matching (by == operator)
     *
     * There are three ways to compare String in Java:
     * 1.	By Using equals() Method
     * 2.	By Using == Operator
     * 3.	By compareTo() Method
     */
    public static void main(String[] args) {
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = "Perscholas";

        System.out.println(s1.compareTo(s2));
        //output:0

        System.out.println(s1.compareTo(s3));
        //output:0

        System.out.println(s3.compareTo(s1));
        //output:0

    }
}
