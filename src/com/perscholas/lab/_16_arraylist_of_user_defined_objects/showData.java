package com.perscholas.lab._16_arraylist_of_user_defined_objects;
import java.util.ArrayList;
import java.util.Iterator;

//Lab 303.7.3 ArrayList of User-Defined Objects

/* Step 3: Create a new Class named "showData."
 */
public class showData {
    public static void main(String[] args) {
        // instantioation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist)
        {
            // ---- invoking getter method for geting Data---------
            System.out.println(showValue.getNumber() + " " +
                    showValue.getName() +" "+ showValue.getCategory() +
                    " "+ showValue.getAuthor());
            /*Output:
            1 Death note cartoon John
            2 Stranger Things suspense brothers
            3 Spider man Kids Alex
            4 GentleMen Action Max
            5 Java FullStack Programming Flex
             */
        }
    }

}
