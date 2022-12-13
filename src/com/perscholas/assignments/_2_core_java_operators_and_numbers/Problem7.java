package com.perscholas.assignments._2_core_java_operators_and_numbers;
//Lab 303.1.3 Practice Assignment Operators and Numbers

/*                  Problem 7
 * Write a program that demonstrates at least 3 ways to
 * increment a variable by 1 and does this multiple times.
 * Assign a value to an integer variable, print it, increment
 * by 1, print it again, increment by 1, and then print again.
 */
public class Problem7 {
    public static void main(String[] args) {
        int n = 4;

        n++;

        System.out.println("the postfix increment increase the value by 1 and is now "+n);

        ++n;

        System.out.println("the prefix increment increase the value by 1 and is now "+n);

        n+= 1;

        System.out.println("the value was increase by 1 and is now "+n);


    }
}
