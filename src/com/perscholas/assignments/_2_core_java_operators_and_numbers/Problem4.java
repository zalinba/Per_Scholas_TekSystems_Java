package com.perscholas.assignments._2_core_java_operators_and_numbers;
//Lab 303.1.3 Practice Assignment Operators and Numbers

/*                  Problem 4
 * Write a program that declares a variable x and assigns
 * 150 to it and prints out the binary string version of
 * the number. Now use the right shift operator (>>) to
 * shift by 2 and assign the result to x. Write a comment
 * indicating what you anticipate the decimal and binary
 * values to be. Now print the value of x and the binary
 * string. Do the preceding exercise with the following
 * values: 225, 1555, 32456
 */
public class Problem4 {
    public static void main(String[] args) {
        int d = 150;

        System.out.println("The binary value of 150 is "+Integer.toBinaryString(d));
        //predicted output: 1000010
        //output: 10010110

        System.out.println("the value of 150 changed to "+(d>>2));
        //predicted output: 75
        //output: 37

        int e = 225;
        System.out.println("the binary value of 225 is "+Integer.toBinaryString(e));
        //predicted output: 0010101111
        //output: 11100001

        System.out.println("the value of 225 changed to "+(e>>2));
        //predicted output: 56
        //output: 56

        int f = 1555;

        System.out.println("the binary value of 1555 is "+Integer.toBinaryString(f));
        //predicted output: 101010111
        //output: 11000010011

        System.out.println("the value of 1555 changed to "+(f>>2));
        //predicted output: 388
        //output: 388

        int g = 32456;

        System.out.println("the binary value of 32456 is "+Integer.toBinaryString(g));
        //predicted output: 01010101111000
        //output: 111111011001000

        System.out.println("value of 32456 changed to "+(g>>2));
        //predicted output: 8114
        //output: 8114

    }
}
