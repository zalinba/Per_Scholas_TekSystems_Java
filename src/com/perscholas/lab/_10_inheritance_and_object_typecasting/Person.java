package com.perscholas.lab._10_inheritance_and_object_typecasting;
//Lab 303.6.1

/* In this lab, we will demonstrate how to use Object
 * type-casting and inheritance using Java. Here is a
 * more in-depth example of inheritance with type-casting.
 * Consider the following classes:
 *
 * create a class named Person
 */

public class Person {
    String         name;
    static int     lifeSpan = 60;
    static double  ageFactor = 1.0;

    public Person() {

        name = "";
    }
    public Person(String aName) {
        name = aName;
    }
    public String getName() { return name; }
    public void setName(String aName) { name = aName; }
    public String toString() {
        return("Hello, my name is " + name);
    }
    public String talk() {
        return("I have nothing to say.");
    }
    public String walk() {
        return("I have nowhere to go.");
    }
    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }

}
