package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.HashSet;

//Lab 303.8.2 HashSet and TreeSet Processing

/* In this lab, we will explore and demonstrate
 * HashSet and TreeSet, using built-in methods.
 *
 * HashSet Examples
 * Example one: Insert Elements to HashSet using addAll().
 *
 *          addAll() - Inserts all the elements
 *          of the specified collection to the set.
 *
 * Create a new Java project and create a new Class
 * named “exampleOne.”
 */
public class ExampleOne {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

        /*Output:
        HashSet: [2, 4, 6]
        New HashSet: [2, 4, 5, 6]
         */
    }

}
