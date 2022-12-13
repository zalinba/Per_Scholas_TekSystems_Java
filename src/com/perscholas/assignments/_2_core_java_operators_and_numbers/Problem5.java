package com.perscholas.assignments._2_core_java_operators_and_numbers;
//Lab 303.1.3 Practice Assignment Operators and Numbers

/*                  Problem 5
 * Write a program that declares 3 int variables x, y,
 * and z. Assign 7 to x and 17 to y. Write a comment that
 * indicates what you predict will be the result of the
 * bitwise & operation on x and y. Now use the bitwise &
 * operator to derive the decimal and binary values and
 * assign the result to z.
 *
 * Now, with the preceding values, use the bitwise | operator
 * to calculate the “or” value between x and y. As before,
 * write a comment that indicates what you predict the values
 * to be before printing them out.
 */
public class Problem5 {
    public static void main(String[] args) {
        int j, k, l;

        j = 7;
        k = 17;
        l = j & k;

        System.out.println("The bitwise AND value of 7 & 17 is "+l);
        //predicted output: 0
        //output: 1

        l = j | k;

        System.out.println("The bitwise OR value of 7|17 is "+l);
        //predicted output: 1
        //output: 23

    }
}
