package com.perscholas.lab._7_array;
//Lab 303.3.3 Array

public class ArrayDemoThree {
    //Compute the Sum and Average of Array Elements
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        /* Output:
         *          Sum = 36
         *          Average = 3.6
         * In the above example, we have created an array of
         * named numbers. We have used them for...each loop
         * to access each array element.
         *
         * Inside the loop, we calculate the sum of each element.
         * Notice the line:
         * int arrayLength = number.length;
         *
         * Here, we are using the length attribute of the array to
         * calculate the size of the array. We then calculate the average using:
         * average = ((double)sum / (double)arrayLength);
         *
         * As you can see, we are converting the int value into a double.
         * This is called "type casting” in Java.
         */

    }
}
