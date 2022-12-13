package com.perscholas.lab._13_how_to_use_interface;
//Lab 303.6.4 How to use Interface

/* Create a class named myRunner. This will be the
 * Main class or entry point for the application.
 */
public class myRunner {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

        /* Output:
            Area of Circle 12.566370614359172
            Coordinates are (1,2)
            After move Down, Coordinates are (1,3)
            After move right, Coordinates are (2,3)
            After move Up, Coordinates are (2,2)
            After move left, Coordinates are (1,2)
            --------Test Polymorphism-------
            After move up , Coordinates are (5,9)
            After move Left , Coordinates are (4,9)
         */

        /* Task:
         * Create two classes: Rectangle and Triangle.
         * Extend both classes from the Shape class, and
         * give an implementation of the Movable interface.
         */

    }
}
