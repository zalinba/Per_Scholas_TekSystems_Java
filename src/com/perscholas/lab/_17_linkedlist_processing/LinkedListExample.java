package com.perscholas.lab._17_linkedlist_processing;
import java.util.*;

//Lab 303.8.1 LinkedList Processing

/* In this lab, we will explore and demonstrate
 * LinkedList using built-in methods.
 *
 * Example One: LinkedList Methods
 * Create a class named “LinkedListExample
 */
public class LinkedListExample {
    public static void main(String args[]) {

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);


        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);

        /* Output:
        Linked List Content: [Item1, Item5, Item3, Item6, Item2]
        LinkedList Content after addition:
                [First Item, Item1, Item5, Item3, Item6, Item2, Last Item]
        First element: First Item
        First element after update by set method: Changed first item
        LinkedList after deletion of first and last element:
                [Item1, Item5, Item3, Item6, Item2]
        Final Content: [Newly added item, Item1, Item3, Item6, Item2]
         */
    }

}
