package com.perscholas.lab._15_arraylist_and_arraylist_methods;
import java.util.ArrayList;
import java.util.List;

//Lab 303.7.2 ArrayList and ArrayList Methods

/* Example 2: Creating an ArrayList From Another Collection
 * This example shows:
 *  ● How to create an ArrayList from another collection
 *    using the ArrayList(Collection c) constructor.
 *  ● How to add all the elements from an existing
 *    collection to the new ArrayList using the addAll() method.
 *
 * Create a new class named “CreateArrayListFromCollectionExample”
 */
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
/*Output:
            [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
 */
}
