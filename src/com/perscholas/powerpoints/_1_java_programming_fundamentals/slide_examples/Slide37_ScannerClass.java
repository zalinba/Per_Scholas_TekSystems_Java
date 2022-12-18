package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
import java.util.Scanner;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide37_ScannerClass {
    public static void main(String[] args) {
        // create an Object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // read input(line of text) from the keyboard
        String name = input.nextLine();
        // prints the name
        System.out.println("My name is " + name);
        // closes the scanner
        input.close();

        //Output: Enter your name: Kelvin
        //        My name is Kelvin
    }

}
