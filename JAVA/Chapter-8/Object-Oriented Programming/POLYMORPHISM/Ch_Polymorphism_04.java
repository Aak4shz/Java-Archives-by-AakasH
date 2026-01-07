// Another Example of Polymorphism in Java

// Parent class 
class Shape {
    double calculateArea() {
        return 0;
    }

    void display() {
        System.out.println("This is a shape.");
    }
}

// * Child class 1 -> ( Circle )
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("This is a Circle with radius : " + radius);
    }
}

// * Child class 2 -> ( Rectangle)

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void display() {
        System.out.println("This is a Rectangle with length : " + length + ", width : " + width);
    }
}

// * Chid class 3 -> ( Triangle )
class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    void display() {
        System.out.println("This is a Triangle with base : " + base + ", height : " + height);
    }
}

public class Ch_Polymorphism_04 {
    public static void main(String[] args) {

        // Array of different shapes
        Shape[] shapes = {
                new Circle(7.324),
                new Rectangle(5.32, 8.02),
                new Triangle(23.10, 33.33)
        };

        // Polymorphism in Action

        for (Shape shape : shapes) {
            shape.display();
            System.out.println("Area : " + shape.calculateArea());
            System.out.println();
        }
    }
}
