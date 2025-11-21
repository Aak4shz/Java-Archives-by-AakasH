// Create a Java program with multiple classes to calculate the area and perimeter of different
//  shapes (Rectangle, Square, Circle, and Triangle).

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and Setter Methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double areaOfRectangle() {
        return length * width;
    }

    public double perimeterOfRectangle() {
        return 2 * (length + width);
    }

    // Method to Display Details
    public void rectangleDetails() {
        System.out.println("==========Rectangle Details==========");
        System.out.println("Length : " + length);
        System.out.println("WIdth : " + width);
        System.out.println("Area : " + areaOfRectangle());
        System.out.println("Perimeter : " + perimeterOfRectangle());
    }
}

class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Getter and Setter Methods
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Method to calculate area
    public double areaOfSquare() {
        return side * side;
    }

    public double perimeterOfSquare() {
        return 4 * side;
    }

    // Method to display details
    public void squareDetails() {
        System.out.println("\n===========Square Details==========");
        System.out.println("Side : " + side);
        System.out.println("Area : " + areaOfSquare());
        System.out.println("Perimeter : " + perimeterOfSquare());
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter Methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to Calculate Area or Perimeter
    public double areaOfCircle() {
        return Math.PI * radius * radius;
    }

    public double perimeterOfCircle() {
        return 2 * Math.PI * radius;
    }

    // Method to Display Details
    public void circleDetails() {
        System.out.println("\n=============Circle Details=============");
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + areaOfCircle());
        System.out.println("Perimeter : " + perimeterOfCircle());
    }

}

class Triangle {
    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    // Getter and Setter Methods
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    // Method to Calculate Area or Perimeter
    public double areaOfTriangle() {
        return 0.5 * base * height;
    }

    public double perimeterOfTriangle() {
        return base + height + hypotenuse;
    }

    // Method to Display Details
    public void triangleDetails() {
        System.out.println("\n===========Triangle Details============");
        System.out.println("Base : " + base);
        System.out.println("Height : " + height);
        System.out.println("Hypotenuse : " + hypotenuse);
        System.out.println("Area : " + areaOfTriangle());
        System.out.println("Perimeter : " + perimeterOfTriangle());
    }
}

public class Ch_OOPs_04 {
    public static void main(String[] args) {
        // Rectangle Object
        Rectangle rect = new Rectangle(25.5, 15.4);
        rect.rectangleDetails();

        // Square Object
        Square sq = new Square(20.33);
        sq.squareDetails();

        // Circle Object
        Circle cir = new Circle(7.23);
        cir.circleDetails();

        // Triangle Object
        Triangle tri = new Triangle(11.1, 15.5, 20.4);
        tri.triangleDetails();

        System.out.println("\n==>==>==>==>==>===>===>===>=After Updating Values=<==<==<==<==<===<===<===<==");
        // Updating Rectangle Values
        rect.setLength(12.5);
        rect.setWidth(15.9);
        rect.rectangleDetails();

        // Updating Square Values
        sq.setSide(35.85);
        sq.squareDetails();

        // Updating Circle Values
        cir.setRadius(65.7);
        cir.circleDetails();

        // Updating Triangle Values
        tri.setBase(87.5);
        tri.setHeight(45.7);
        tri.setHypotenuse(69.7);
        tri.triangleDetails();

    }
}
