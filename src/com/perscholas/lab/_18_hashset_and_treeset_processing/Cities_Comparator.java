package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.Comparator;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Example four: sort the given TreeSet alphabetically
 * in reverse order.
 * In this example, we will implement a Comparator class
 * to sort the given TreeSet alphabetically in reverse
 * order. By default, the TreeSet sorts data in ascending order.
 *
 * We can also sort TreeSet in a customized order by defining
 * a new comparator class. In this comparator class, we need
 * to override the ‘compare’ method to sort the elements of
 * the TreeSet. This comparator object is then passed to the
 * TreeSet constructor.
 *
 * Create a class named “Cities_Comparator.”
 */
public class Cities_Comparator implements Comparator<String>  {
    //override compare method to compare two elements of the TreeSet
    @Override
    public int compare(String cities_one, String cities_two) {
        int value =  cities_one.compareTo(cities_two);
        // sort elements in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
