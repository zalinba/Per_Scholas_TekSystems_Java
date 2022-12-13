package com.perscholas.lab._10_inheritance_and_object_typecasting;
//Lab 303.6.1

//Create a class named Boy
public class Boy extends Person{
    static double   ageFactor = 1.1;

    public String talk() {
        return(super.talk() + " ... but I love Java class.");
    }
    public String walk() {
        return("I am now walking");
    }

}
