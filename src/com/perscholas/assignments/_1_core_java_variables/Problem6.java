package com.perscholas.assignments._1_core_java_variables;
//Lab 303.1.2 Practice Assignment Core Java Variables

/*                     Problem 6
 * Write a program that declares two integer variables,
 * x, and y, and assigns 5 to x and 6 to y. Declare a
 * variable q and assign y/x to it and print q. Now,
 * cast y to a double and assign it to q. Print q again.
 */
public class Problem6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int q = y / x;

        System.out.println("Problem 6: The sum of y / x is " + q);
        /* Output:
        Problem 6: The sum of y / x is 1
         */

        /* q = (double) y;
           System.Out.Println(q);

           I get an error after casting y to a double
           when I print out q.

           Corrections I did
           I made another double variable called 'sum' and assigned
           (double)y / b to result.
         */
        double sum = (double)y / x;

        System.out.println("Problem 6: The sum of y / x is " + sum);







    }
}
