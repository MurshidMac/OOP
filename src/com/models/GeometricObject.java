package com.models;

public abstract class GeometricObject {
    protected boolean filled;
    protected String color;
    public GeometricObject(){

    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled  = filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }
    public abstract double getPerimeter();
    public abstract String getShape();
    public abstract  double getArea();

    @Override
    public String toString() {
        return "GeometricObject{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
