package com.perscholas.lab._5_for_loop;
//Lab 303.3.1 for loop

public class DisplayATextFiveTimes {
    /* A simple for loop allows us to iterate over items
     * until a specified condition is met or satisfied.
     * This normally works with the help of a counter,
     * which will be initialized at the start of the
     * execution and will be incremented with each iteration.
     *
     * A simple for loop has the following syntax:
     *
     *      for (initialization; termination;increment) {
     *          statement(s)
     *     }
     */
    public static void main(String[] args) {
        int n = 5;

        //for loop
        for (int i = 1; i <=n; ++i) {
            System.out.println("Java is fun");
            //output:Java is fun
            //       Java is fun
            //       Java is fun
            //       Java is fun
            //       Java is fun
        }

    }
}
