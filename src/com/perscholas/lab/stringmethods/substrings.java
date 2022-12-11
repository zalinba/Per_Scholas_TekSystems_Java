package com.perscholas.lab.stringmethods;
//Lab 303.2.1

import java.util.StringJoiner;

public class substrings {
    /* The substring() method extracts a substring
     * from the string and returns it. The syntax
     * of the substring() method is
     *
     * stringObj.substring(int startIndex, int endIndex)
     * Basically coordinates
     */
    public static void main(String[] args) {
        String str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0 , 4));
        //output: java
    }
}
