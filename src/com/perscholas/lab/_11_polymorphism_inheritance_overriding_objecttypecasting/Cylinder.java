package com.perscholas.lab._11_polymorphism_inheritance_overriding_objecttypecasting;
//Lab 303.6.2 Polymorphism, Inheritance, Overriding, Object type casting

/* Create a class named Cylinder. This will be a
 * Child class.
 */
public class Cylinder extends Shape{
    private final double PI = Math.PI  ;

    public Cylinder(double radius, double height) {
        super(radius, height);
        // TODO Auto-generated constructor stub
    }

    public Cylinder(double radius) {
        super(String.valueOf(radius));
    }

    /** Returns the volume of this cylinder */
    public double getVolume() {
        return  (PI*Math.pow(super.radius, 2)) * super.height;
    }

    public double getSurfaceArea() {
        return 2.0 * Math.PI*super.radius*super.height;
    }
    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Cylinder for radius " + super.radius);
    }
    public String toString()
    {
        return "radius is: " + super.radius +"height is : " + super.height;

    }


}
