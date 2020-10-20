package com.models;

import java.lang.annotation.Inherited;

public class Cylinder extends Circle{

    private double height;
    // Constructor with SUPER CALL
    public Cylinder() {
        super();
        height = 1.0;
    }
    // Constructor with
    public Cylinder(double height) { super();
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    // A public method for computing the volume of cylinder // use superclass method getArea() to get the base area public double getVolume() {
    public double getVolume() {
        double volume = getArea()*height; return volume;
    }
    //area of a cylinder is = 2 π x radius x height + 2 x base-area
    @Override
    public double getArea(){
        double area = super.getArea();
        double cylinderRadius = 2*super.getPi()*this.getRadius()*height + 2*super.getArea();
        return cylinderRadius;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
