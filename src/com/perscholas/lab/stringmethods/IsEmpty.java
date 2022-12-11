package com.perscholas.lab.stringmethods;
//Lab 303.2.1
public class IsEmpty {
    /* This method checks whether the String
     * contains anything or not. If the Java
     * String is empty, it returns true or false.
     * For example:
     */
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "hello";

        System.out.println(s1.isEmpty());
        //output: true

        System.out.println(s2.isEmpty());
        //output: false

    }
}
