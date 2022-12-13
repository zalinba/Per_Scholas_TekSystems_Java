package com.perscholas.assignments._1_core_java_variables;
//Lab 303.1.2 Practice Assignment Core Java Variables

/*                  Problem 5
 * Write a program that declares 2 double variables,
 * assigns a number to each, and divides the larger
 * by the smaller. Assign the result to a variable.
 * Print out the result. Now, cast the result to an
 * integer. Print out the result again.
 */
public class Problem5 {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 2.0;
        double sum = a / b;

        System.out.println("Problem 5: The sum of a / b is equal to " + sum);
        /* Output:
        Problem 5: The sum of a / b is equal to 2.0
         */

        int c = (int) sum;

        System.out.println("Problem 5: The sum of a / b is equal to " + c);
        /* Output:
        Problem 5: The sum of a / b is equal to 2
         */

    }
}
