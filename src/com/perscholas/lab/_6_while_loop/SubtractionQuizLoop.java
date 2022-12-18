package com.perscholas.lab._6_while_loop;
import java.util.Scanner;
//Lab 303.3.2 While Loop

public class SubtractionQuizLoop {
    /* Write a program that generates five single-digit
     * integer subtraction problems.
     *
     * Using a while loop, prompt the user to answer all
     * five problems.
     *
     * After all the answers are entered, report the
     * number of the correct answers. Offer the user the
     * opportunity to play the game again.
     */
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = ""; // output string is initially empty

        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            // 3. Prompt the student to answer "What is number1 - number2?"
            System.out.print(
                    "What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));
            // Increase the count
            count++;
            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong");
        }


    }
}
