package com.perscholas.lab.forloop;
//Lab 303.3.1 for loop

public class DisplaySumOfNaturalNumbers {
    /* Program to find the sum of natural
     * numbers from 1 to 1000.
     */
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        //for loop
        for(int i = 1; i <= n; ++i){
            //body inside for loop
            sum += i; //sum = sum + i
        }
        System.out.println("Sum = " + sum);
        //output:500500

        /* The value of sum is 0 initially. Then the for
         * loop is iterated from i = 1 to 1000. In each
         * iteration, i is added to the sum and its value
         * is increased by 1. When i becomes 1001, the test
         * condition is false, and the sum will be equal to
         * 0 + 1 + 2 + .... + 1000.
         */

    }
}
