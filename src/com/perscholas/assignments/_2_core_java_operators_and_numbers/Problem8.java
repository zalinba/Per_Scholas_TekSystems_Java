package com.perscholas.assignments._2_core_java_operators_and_numbers;
//Lab 303.1.3 Practice Assignment Operators and Numbers

/*                  Problem 8
 * Write a program that declares 2 integer variables, x,
 * and y, and then assigns 5 to x and 8 to y. Create
 * another variable sum and assign the value of ++x
 * added to y and print the result. Notice the value
 * of the sum (should be 14). Now change the increment
 * operator to postfix (x++) and re-run the program.
 * Notice what the value of sum is. The first configuration
 * incremented x and then calculated the sum while the
 * second configuration calculated the sum and then incremented x.
 */
public class Problem8 {
    public static void main(String[] args) {
        int h, i, sum;

        h = 5;
        i = 8;
        sum = (++h) + i;

        System.out.println("value of sum is " + sum);

        h = 5;
        i = 8;
        sum = (h++) + i;

        System.out.println("re-run value of sum is " + sum);

    }
}
