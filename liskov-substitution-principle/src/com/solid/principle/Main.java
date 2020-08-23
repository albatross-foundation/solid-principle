package com.solid.principle;

import com.solid.principle.solution.Shape;
import com.solid.principle.violation.Rectangle;
import com.solid.principle.violation.Square;

public class Main {

    // Violation
    private static Rectangle getNewRectangle() {
        // it can be an object returned by some factory ...
        return new Square();
    }

    // Solution
    static final String SQUARE = "Square";
    static final String RECTANGLE = "Rectangle";

    static Shape getShape(String shapeType) {
        if (shapeType.equals(SQUARE)) {
            return new com.solid.principle.solution.Square();
        }
        if (shapeType.equals(RECTANGLE)) {
            return new com.solid.principle.solution.Rectangle();
        }
        return null;
    }

    public static void main(String[] args) {
        // Violation
        Rectangle rectangle = Main.getNewRectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println(rectangle.getArea());

        // Solution
        Shape shape1 = getShape(SQUARE);
        shape1.setWidth(10);
        shape1.setHeight(20);
        System.out.println(SQUARE + "'s area: " + shape1.getArea());

        Shape shape2 = getShape(RECTANGLE);
        shape2.setWidth(10);
        shape2.setHeight(20);
        System.out.println(RECTANGLE + "'s area: " + shape2.getArea());
    }
}
