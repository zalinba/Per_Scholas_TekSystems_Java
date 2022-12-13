package com.perscholas.lab._8_encapsulation;
//Lab 303.5.1 Encapsulation in Java

/* Objective: In this lab, we will demonstrate Encapsulation
 * in the Java language.
 *
 * Encapsulation in Java: Hiding the
 * class variable from other classes and giving access to
 * them only through methods (setters and getters).
 *
 * Encapsulation in Java means binding the data (variables)
 * with the code (methods – setters and getters).
 *--------------------------------------------------------------
 * HumanBeing class diagram:
 * -Class Variables (in the example: height, weight, bmi) are
 *  declared private; hence, they are not visible to other classes.
 *
 * -For each variable, there is a setter and getter method, which
 *  sets a value to the variable and gets the variable's value,
 *  respectively.
 *
 *      Example: For variable height, setter method is setHeight(),
 *      getter method is getHeight().
 *
 * -Setter and Getter methods are public; hence, they are visible
 *  to other classes.
 * --------------------------------------------------------------
 * A Program Example: Create a class named HumanBeing with two
 * constructors: class variables (weight, height, and bmi); and
 * setter and getter methods.
 */
public class HumanBeing {
    private float weight;
    private float height;
    private float bmi;

    public HumanBeing(float weight, float height, float bmi )
    {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }
    public HumanBeing()
    {

    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getBmi() {
        return bmi;
    }
    public void setBmi(float bmi) {
        this.bmi = bmi;
    }


}
