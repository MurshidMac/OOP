package com.oop.week4.abstract_interfaces;

import com.models.GeometricShapeCollection;
import com.models.ShapeCollection;

public class TestAbstract_Inheritance {
    public static void main(String[] args) {
        // create a parking
        ShapeCollection sys = new GeometricShapeCollection(10);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();

        }
    }
}