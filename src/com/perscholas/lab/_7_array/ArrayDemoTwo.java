package com.perscholas.lab._7_array;
//Lab 303.3.3 Array

public class ArrayDemoTwo {
    //Using for loop
    public static void main(String[] args) {
        // create an array
        int[] age = {12, 4, 5};

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    /* Output
     * Using for Loop:
     * 12
     * 4
     * 5
     *
     * In the above example, we are using the for Loop
     * in Java to iterate through each element of the array.
     * Notice the expression inside the loop, age.length
     */
    }
}
