package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

import org.w3c.dom.ls.LSOutput;

/* The 'new' keyword is used to create objects.
 *
 * When objects are created, special methods called
 * constructors run to initialize the object.
 *
 * The default value of any reference variable is null,
 * which means that there is nothing there.
 *
 * There are three steps when creating an object from a class:
 * Declaration − A variable declaration with a variable name with an object type.
 * Instantiation − The 'new' keyword is used to create the object.
 * Initialization − The 'new' keyword is followed by a call to a constructor.
 * This call initializes the new object.

 */
public class Slide22_CreatingAnObject {
    public Slide22_CreatingAnObject(String name) {
        System.out.println("Puppy name is: " + name);
    }
    public static void main(String[] args) {
        Slide22_CreatingAnObject puppy = new Slide22_CreatingAnObject("Tommy");
/*


 */


    }
}
