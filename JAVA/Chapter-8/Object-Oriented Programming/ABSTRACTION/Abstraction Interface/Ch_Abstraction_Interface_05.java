/* The Challenge:

    Create an interface named Shape.

    Define two abstract methods: double calculateArea() and double calculatePerimeter().

    Create two classes, Circle and Rectangle, that implement the Shape interface.

        Circle should have a radius field.

        Rectangle should have length and width fields.

    Main Class: Create an ArrayList<Shape> and add one Circle and one Rectangle. Loop through the list and print the area of each.

Constraints:

    Use Math.PI for calculations.

    Encapsulate your fields (use private fields and constructors).
 */

import java.util.ArrayList;

interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Ch_Abstraction_Interface_05 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
        System.out.println();

        for (Shape shape : shapes){
            System.out.println("Perimeter : " + shape.calculatePerimeter());
        }
        System.out.println();
    }
}
