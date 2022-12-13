package com.perscholas.lab._13_how_to_use_interface;
//Lab 303.6.4 How to use Interface

/* In the previous Lab[LAB - 3.6.3 ], we demonstrated
 * that an abstract class has both methods with bodies,
 * and methods with no bodies (abstract methods). You
 * learned that abstract methods must be overridden in a subclass.
 *
 * An Interface is similar to an abstract class with no
 * fields and all abstract methods. Interfaces cannot be
 * instantiated—they can only be implemented by classes.
 * The purpose of an Interface is to specify behavior for a class.
 *
 * In other words, we can say that an Interface is a design
 * contract. It specifies methods and classes that can "implement"
 * the Interface, and thereby sign the contract.
 *
 * We will use the Shapes example in this Lab.
 *      Suppose that our application involves many shapes that
 *      can move. We could define an interface called movable,
 *      containing the signatures of the various movement methods.
 *                          @  @  @  @  @  @  @  @  @  @  @  @  @  @  @  @
 *                        @                                                @
 *  __________________________             __________________________      @
 * |       Shape Class        |           |     Movable interface    |     @
   |     ---------------      |           |      ---------------     |     @
   | getArea()                |           | void moveUp();           |     @
   | displayName()            |           | void moveDown();         |     @
   | toString()               |           | void moveLeft();         |     @
   | Getters and Setters      |@ @ @      | void moveRight();        |     @
    __________________________     @      | String getCoordinate();  |     @
            @                      @       *_________________________      @
            @            * * * * * * * * *           *              *      @
    ________@____________*____    _@_________________*_____    _____*______@__________
   |          Circle          |  |         Rectangle       |  |      Triangle         |
   |       ------------       |  |       -------------     |  |    -------------      |
   | getArea()                |  | getArea()               |  | getArea()             |
   | displayName()            |  | displayName()           |  | displayName()         |
   | toString()               |  | toString()              |  | toString()            |
   | Getters and Setters      |  | Getters and Setters     |  | Getters and Setters   |
    __________________________    _________________________    _______________________
            @
    ________@_________________
   |        Cylinder          |
   |     --------------       |
   | getVolume()              |
   | getSurfaceArea()         |
   | displayName()            |
   | toString()               |
   | Getters and Setters      |
    __________________________

 * Create a class named Shape. This will be an Abstract
 * class and a Super class.
 */
public abstract class Shape {
    protected String color;
    protected double height;  // To hold height.
    protected double width;  //To hold width
    protected double base;  //To  hold base

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

// The getArea method is abstract.
    // It must be overridden in a subclass.
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayShapeName()
    {
        System.out.println("I am a Shape.");
    }


}
