package com.models;

public class Rectangle extends GeometricObject {
    protected double length;
    protected double width;

    public Rectangle(){

    }

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
