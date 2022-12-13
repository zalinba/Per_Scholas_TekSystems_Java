package com.perscholas.assignments._1_core_java_variables;
//Lab 303.1.2 Practice Assignment Core Java Variables

/*                  Problem 4
 * Write a program that declares 2 integer variables,
 * assigns an integer to each, and divides the larger
 * number by the smaller number. Assign the result to
 * a variable. Print out the result. Now change the
 * larger number to a decimal. What happens?
 * What corrections are needed?
 */
public class Problem4 {
    public static void main(String[] args) {
      /*int a;
        int b;
        a = 4;
        b = 2;
        int sum = a / b;

        System.out.println("Problem 4: The sum of a / b is equal to " + sum);
           Output:
           Problem 4: The sum of a / b is equal to 2


        //Change the larger number to a decimal
           a = 4.0;
           b = 2;
           sum = a / b;

           System.out.println(sum);
           I will get an error when the print statement is executed
           Error is due to the 'a' variable having an incompatible
           value type where 'a' is an integer variable and the value
           assigned to it is a double.
         */

        int a;
        int b;
        a = 4;
        b = 2;
        int sum = a / b;
        double result = (double)a / b;

        System.out.println("Problem 4: The sum of a / b is equal to " + result);
        /* Output:
        Problem 4: The sum of a / b is equal to 2.0

        What corrections are needed
        I made another double variable called 'result' and assigned
        (double)a / b to result.
         */

    }
}
