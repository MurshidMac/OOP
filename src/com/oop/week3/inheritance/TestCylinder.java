package com.oop.week3.inheritance;

import com.models.Circle;
import com.models.Cylinder;

public class TestCylinder {

    public static void main(String[] args) {
	// write your code here
        // Declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea() + " volume=" + c1.getVolume());
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea() + " volume=" + c2.getVolume());

        Cylinder c3 = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea() + " volume=" + c3.getVolume());

        Circle circle = new Circle(12);
        System.out.println("Area of the circle "+ circle.getArea());
        Cylinder cylinder = new Cylinder(12,15);
        System.out.println("Area of the Cylinder "+ cylinder.getArea());
        System.out.println("Volume of the Cylinder "+ cylinder.getVolume());

    }
}
