package com.perscholas.lab.stringmethods;
//Lab 303.2.1

public class compareTo {
    /* The Java String compareTo() method compares
     * the given string with the current string.
     * It is a method of ‘Comparable’ interface that
     * is implemented by the String class. It either
     * returns a positive number, negative number or 0.
     * For example:
     */
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";

        System.out.println(s1.compareTo(s2));
        //output: 0
        //both are equal

        System.out.println(s1.compareTo(s3));
        //output: -1
        //because "l" is only one time lower than "m"

        System.out.println(s1.compareTo(s4));
        //output: 2
        //because "h" is 2 times greater than "f"

        /* The above program shows the comparison between
         * the various Strings. Notice:
         *      if s1 > s2, it returns a positive number.
         *      if s1 < s2, it returns a negative number.
         *      if s1 == s2, it returns 0.


         */


    }
}
