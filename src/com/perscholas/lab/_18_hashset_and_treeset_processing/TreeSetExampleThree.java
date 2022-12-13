package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.TreeSet;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Example three: Methods for Navigation.
 * Since the TreeSet class implements NavigableSet,
 * it provides various methods to navigate over the
 * elements of the TreeSet.
 *
 * 1. first() and last() Methods
 *      ● first() - returns the first element of the set.
 *      ● last() - returns the last element of the set.
 */
public class TreeSetExampleThree {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        /*Output:
        TreeSet: [5, 10, 15, 20, 25]
        TreeSet using Iterator: 5, 10, 15, 20, 25
         */
    }

}
