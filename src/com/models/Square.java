package com.models;

public class Square extends  GeometricObject{
    protected double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return (4*this.side);
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public double getArea() {
        return (this.side*this.side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
