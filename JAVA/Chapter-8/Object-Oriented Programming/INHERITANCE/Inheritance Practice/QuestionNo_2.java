// Create a class Shape with a method getArea(). 
// Make a subclass Rectangle that overrides getArea() to calculate the area of a rectangle​.

class Shape {
    public double getArea() {
        System.out.println("Area is not defined for generic shape.");
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    // Override method getArea()
    @Override
    public double getArea() {
        return length * breadth;
    }
}

public class QuestionNo_2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.getArea();
        System.out.println("------------Rectangle--------------");
        Rectangle rect = new Rectangle(14.4, 10.33);
        System.out.println("Area of Rectangle = " + rect.getArea());
    }

}
