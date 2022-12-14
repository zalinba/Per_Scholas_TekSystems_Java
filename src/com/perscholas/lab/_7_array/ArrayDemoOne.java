package com.perscholas.lab._7_array;
//Lab 303.3.3 Array

public class ArrayDemoOne {
    /* AccessArray Elements
     * The goal of this lab is to provide you with hands-on
     * experience in working with Java arrays and iterating
     * over an Array using loops.
     */
    public static void main(String[] args) {
        // create an array
        int[] age = {12, 4, 5, 2, 5};
        // access each array elements
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        /* Output
         * Accessing Elements of an Array:
         *  ● First Element: 12
         *  ● Second Element: 4
         *  ● Third Element: 5
         *  ● Fourth Element: 2
         *  ● Fifth Element: 5
         *
         * In the above example, notice that we are using
         * the index number to access each element of the array.
         *
         * We can use loops to access all the array elements at once.
         */

    }
}
