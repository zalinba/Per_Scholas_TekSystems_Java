package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class trim {
    /* The Java string trim() method removes
     * the leading and trailing spaces. It checks
     * the Unicode value of the space character
     * (‘\u0020’) before and after the string.
     * If it exists, then remove the spaces and
     * return the omitted string. For example:
     */
    public static void main(String[] args) {
        String s1 = "  hello  ";
        System.out.println(s1 + "how are you");
        //output:   hello   how are you

        System.out.println(s1.trim() + "how are you");
        //output: hello how are you

    }
}
