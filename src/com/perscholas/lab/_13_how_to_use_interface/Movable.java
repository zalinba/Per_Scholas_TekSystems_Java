package com.perscholas.lab._13_how_to_use_interface;
//Lab 303.6.4 How to use Interface

/* Create an Interface named Movable. It is
 * similar to creating a new class
 */
public interface Movable {
    /* An interface defines a list of public abstract
      methods to be implemented by the subclasses
     */

    void moveUp();    // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();

    /* Similar to an abstract class, an Interface cannot
     * be instantiated because it is incomplete (the abstract
     * methods' body is missing). To use an interface, you
     * must derive subclasses and provide implementation to
     * all the abstract methods declared in the interface.
     * The subclasses are now complete and can be instantiated.
     *
     * To derive subclasses from an interface, a new keyboard
     * "implement" is to be used instead of "extends" for deriving
     * subclasses from an ordinary class or an abstract class.
     * It is important to note that the subclass implementing
     * an interface needs to override ALL abstract methods defined
     * in the interface; otherwise, the subclass cannot be compiled.
     */
}

