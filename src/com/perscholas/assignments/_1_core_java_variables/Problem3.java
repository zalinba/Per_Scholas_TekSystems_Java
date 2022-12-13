package com.perscholas.assignments._1_core_java_variables;
//Lab 303.1.2 Practice Assignment Core Java Variables

/*              Problem 3
 * Write a program that declares an integer
 * variable and a double variable, assigns
 * numbers to each, and adds them together.
 * Assign the sum to a variable. Print out
 * the result. What variable type must the sum be?
 */
public class Problem3 {
    public static void main(String[] args) {
        int a;
        double b;
        a = 1;
        b = 1;
        double sum = a + b;

        System.out.println("Problem 3: The sum of a + b is equal to " + sum + "\n" +
                "The variable type must be double for the sum");
        /* Output:
           Problem 3: The sum of a + b is equal to 2.0
           The variable type must be double for the sum
         */
    }
}
