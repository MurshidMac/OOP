package com.models;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int numObject) {
        this.shapeList = new ArrayList<GeometricObject>(); // Very Important
        this.numObject = numObject;
    }

    @Override
    public void addShape(GeometricObject shape) {
        // check if there are spaces and add the shape to the list
        if (shapeList.size() < numObject) {
            shapeList.add(shape);
        } else {
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for (int i = 0; i < shapeList.size(); i++) {
            //Verify if it is a Circle
            if (shapeList.get(i).getShape().equals("Circle")) {
                System.out.println("Shape = Circle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
            // continue the implementation of this method and write here code to verify
            // if it is a rectangle or a square and print the area and the perimeter
            if (shapeList.get(i).getShape().equals("Rectangle")) {
                System.out.println("Shape = Rectangle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
            if (shapeList.get(i).getShape().equals("Square")) {
                System.out.println("Shape = Square, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }

        }
    }

    @Override
    public boolean runMenu() {

        boolean exit = false;

        System.out.println("To Add a new shape");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        Scanner s = new Scanner(System.in);
        int choise = s.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");
                int choise2 = s.nextInt();
                s.nextLine();
                System.out.println("Enter the color of your shape");
                String colour = s.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = s.nextLine();
                boolean filled = false;
                if (isFilled.equals("y"))
                    filled = true;
                else if (isFilled.equals("n"))
                    filled = false;
                else
                    System.out.println("Please enter y or n, if the shape is filled or not respectively");
                switch (choise2) {
                    case 1:
                        // it is a circle
                        System.out.println("Insert the radius");
                        int radius = s.nextInt();
                        Circle c = new Circle(radius, colour, filled);
                        this.addShape(c);
                        break;
                    case 2:
                        // It is a rectangle
                        System.out.println("Insert the length");
                        int length = s.nextInt();
                        System.out.println("Insert the width");
                        int width = s.nextInt();
                        Rectangle r = new Rectangle(length,width);
                        this.addShape(r);
                        break;
                    case 3:
                        System.out.println("Insert the side length");
                        int side = s.nextInt();
                        Square sq = new Square(side);
                        this.addShape(sq);
                        break;
                }
                break;
            case 2:
                this.printShapeList();
                break;
            case 3:
                exit = true;
                break;

        }
        return exit;
    }
}

