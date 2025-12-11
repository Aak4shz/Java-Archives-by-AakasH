
// Real life program of Abstraction example --> Shape Area Calculator

abstract class Shape {
    String name;
    String shapeType;

    Shape(String name, String shapeType) {
        this.name = name;
        this.shapeType = shapeType;
    }

    abstract double getArea();

    abstract double getPerimeter();

    void printDisplay() {
        System.out.println("Shape Name : " + name);
        System.out.println("Shape Type : " + shapeType);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }

}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        super("Rectangle", "2D");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + breadth);

    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle", "2D");
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    double hypotenuse;

    Triangle(double base, double height, double hypotenuse) {
        super("Triangle", "2D");
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    double getPerimeter() {
        return base + height + hypotenuse;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        super("Square", "2D");
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        super("Sphere", "3D");
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        // Perimeter of a sphere is the circumference of a great circle
        return 2 * Math.PI * radius;
    }
}

public class Ch_Abstraction_02 {
    public static void main(String[] args) {

        // using array loop
        Shape[] shapes = {

                new Rectangle(31.05, 15.33),
                new Circle(24.53),
                new Triangle(15.361, 27.123321, 73.8400),
                new Square(24.440),
                new Sphere(23.369)
        };

        for (Shape xvi : shapes) {
            xvi.printDisplay();
            System.out.println("-------------------------");
        }
    }
}
