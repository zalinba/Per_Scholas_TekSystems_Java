package com.perscholas.assignments._1_core_java_variables;
//Lab 303.1.2 Practice Assignment Core Java Variables

/* Create a Java Project in eclipse called CoreJavaBasics.
 * In the src folder, make a package and name it
 * com.perscholas.java_basics. Create a class with a main( )
 * method to run the following exercises (You may name the
 * class whatever you like. Examples: JavaBasicsClass,
 * HomeClass, IndexClass, PracticeClass, etc.).
 */

/*                      Problem 1
 * Write a program that declares 2 integer variables, assigns
 * an integer to each, and adds them together. Assign the sum
 * to a variable. Print out the result.
 */
public class Problem1 {
    public static void main(String[] args) {

        int a;
        int b;
        a = 1;
        b = 1;
        int sum = a + b;

        System.out.println("Problem 1: The sum of a + b is equal to " + sum);
        /* Output:
           Problem 1: The sum of a + b is equal to 2
         */

    }
}
