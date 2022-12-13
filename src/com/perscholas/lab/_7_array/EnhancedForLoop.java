package com.perscholas.lab._7_array;
//Lab 303.3.3 Array

public class EnhancedForLoop {
    //Iterating Over an Array using EnhancedForLoop
    public static void main(String[] args) {
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
        for (String name : names) {
            System.out.println(name);
        }
    /* Output:
     *          New York
     *          Dallas
     *          Las Vegas
     *          Florida
     */
    }
}
