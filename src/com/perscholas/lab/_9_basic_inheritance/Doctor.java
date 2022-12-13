package com.perscholas.lab._9_basic_inheritance;
//Lab 303.5.2 Basic Inheritance

/* The process by which one class acquires the
 * properties (data members) and functionalities
 * (methods) of another class is called inheritance.
 * The aim of inheritance is to provide the reusability
 * of code so that a class has to write only the unique
 * features, and the rest of the common properties and
 * functionalities can be extended from the other class.
 *
 * Child Class: The class that extends the features of
 * another class is known as a child class, subclass, or
 * derived class.
 *
 * Parent Class: The class whose properties and functionalities
 * are used (inherited) by another class is known as the parent
 * class, superclass, or base class.
 *
 * Inheritance is considered an IS-A relationship type. This means
 * a child class has an IS-A relationship with the parent class.
 * This inheritance is known as the IS-A relationship between the
 * child and parent class.
 *
 * Begin in this Lab, we have a base class, “Doctor”, and a subclass, “Surgeon.”
 * -Create a class named Doctor
 */

//public class
public class Doctor {
    String DoctorName;
    String Department;

    public void Doctor_Details() {
        System.out.println("Doctor Details...");
    }

}
