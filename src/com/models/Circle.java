package com.models;

public class Circle extends GeometricObject{
    private double radius = 1.0;
    private double pi = 3.141592653589793238;
    public Circle(){
        super.color = "blue";
    }
    // Constructor Overloading
    public Circle(double customRadius){
        this.radius = customRadius;
    }
    public Circle(double customRadius, String customColor){
        this.radius = customRadius;
        this.color = customColor;
    }

    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        this.color = colour;
        this.filled = filled;
    }
    // Getters and Setters
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double customRadius){
        this.radius = customRadius;
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    public void setColor(String customColor){
        this.color = customColor;
    }

    @Override
    public double getArea(){
        // Area of a Circle = pi*(radius*radius)
        double area = this.pi * (this.radius*this.radius);
        return area;
    }
    public String toString() {
        return "Circle:  radius=" + this.radius;
    }
    public double getPi(){
        return this.pi;
    }
}
