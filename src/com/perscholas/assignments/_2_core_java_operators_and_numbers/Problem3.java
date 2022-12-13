package com.perscholas.assignments._2_core_java_operators_and_numbers;
//Lab 303.1.3 Practice Assignment Operators and Numbers

/*                  Problem 3
 * Write a program that declares an integer a variable x
 * and assigns the value 2 to it and prints out the binary
 * string version of the number ( Integer.toBinaryString(x) ).
 * Now, use the left shift operator (<<) to shift by 1 and
 * assign the result to x. Before printing the results, write
 * a comment with the predicted decimal value and binary string.
 * Now, print out x in decimal form and in binary notation.
 * Do the preceding exercise with the following values:
 * 9, 17, 88
 */
public class Problem3 {
    public static void main(String[] args) {
        int x = 2;

        System.out.println("the binary value of 2 is    "+Integer.toBinaryString(x));
        //predicted output: 0010
        //output: 10

        System.out.println("the value of 2 changed to "+(x<<1));
        //predicted output: 4
        //output: 4

        int a = 9;

        System.out.println("the binary value of 9 is "+Integer.toBinaryString(a));
        //predicted output: 1001
        //output: 1001

        System.out.println("the value of 9 changed to "+(a<<1));
        //predicted output: 18
        //output: 18

        int b = 17;

        System.out.println("the binary value of 17 is "+Integer.toBinaryString(b));
        //predicted output: 110101
        //output: 10001

        System.out.println("the value of 17 changed to "+(b<<1));
        //predicted output: 34
        //output: 34

        int c = 88;

        System.out.println("the binary value of 88 is "+Integer.toBinaryString(c));
        //predicted output: 1000110101
        //output: 1011000

        System.out.println("the value of 88 changed to "+(c<<1));
        //predicted output: 176
        //output: 176

    }
}
