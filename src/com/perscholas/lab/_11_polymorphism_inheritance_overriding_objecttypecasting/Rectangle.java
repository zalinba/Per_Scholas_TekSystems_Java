package com.perscholas.lab._11_polymorphism_inheritance_overriding_objecttypecasting;
//Lab 303.6.2 Polymorphism, Inheritance, Overriding, Object type casting

/* Create a class named Rectangle. This will be a
 * Child class.
 */
public class Rectangle extends Shape{
    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {
    }

    public Rectangle(String color, double area, double base, double width, double height)
    {
        super(color, area, base, width, height);
    }

    @Override
    public void setBase(double base) {
        super.base = base;   }
    @Override
    public void setWidth(double width) {
        super.width = width;   }
    @Override
    public double getArea() {
        return width * height;   }

    public double perimeter() {
        super.area =  super.width * super.height;
        return super.area;   }
    //Overriding method of base class with different implementation
    @Override
    public void displayShapeName() {
        System.out.println("I am a Rectangle"  );   }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }

}
