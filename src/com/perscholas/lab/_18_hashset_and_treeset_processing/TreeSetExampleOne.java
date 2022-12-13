package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.TreeSet;
import java.util.Iterator;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Example one: Iterate Through TreeSet.
 * To access the individual elements of TreeSet,
 * we need to iterate through the TreeSet.
 * In other words, traverse through the TreeSet.
 * We do this by declaring an Iterator for the
 * TreeSet, and then use this Iterator to access
 * each element. For this, we use the next () method
 * of an iterator that returns the next element
 * in the TreeSet.
 */
public class TreeSetExampleOne {
    public static void main(String[] args) {

        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);

        // Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_set = num_Treeset.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Access TreeSet elements using Iterator
        while(iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(", ");

            /*Output:
            TreeSet using Iterator: 5, 10, 15, 20, 25,
             */
        }
    }

}
