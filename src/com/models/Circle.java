package com.models;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    private double pi = 3.141592653589793238;
    public Circle(){

    }
    // Constructor Overloading
    public Circle(double customRadius){
        this.radius = customRadius;
    }
    public Circle(double customRadius, String customColor){
        this.radius = customRadius;
        this.color = customColor;
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
    public void setColor(String customColor){
        this.color = customColor;
    }
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
