package com.perscholas.lab._3_string_methods;
import java.util.Arrays;
//Lab 303.2.1

public class split {
    /* The split() method divides the string
     * at the specified regex and returns an
     * array of substrings. Syntax of the
     * string split() method is:
     *      string.split(String regex, int limit)
     * ●	regex - the string is divided at this regex (can be strings)
     * ●	limit (optional) - controls the number of resulting substrings
     * If the limit parameter is not passed, split() returns all possible substrings.
     */
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("results = " + Arrays.toString(result));
        //output:[a, b, c, d:e]

        /* Here, we split the string at ::  Since the limit
         * parameter is not passed, the returned array contains
         * all the substrings.

         */


    }
}
