/* Write a program that overloads the method area() to calculate:
 * area of triangle
 * area of circle
 * area of rectangle
 * area of square
 * 
 */
public class Question_11 {
    // Area of triangle
    double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Circle
    double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    // Area of Square
    double areaOfSquare(double side) {
        return side * side;
    }

    // Main Method
    public static void main(String[] args) {
        Question_11 obj = new Question_11();
        System.out.println("Area Of Triangle : " + obj.areaOfTriangle(12.0, 8.12));
        System.out.println("Area Of Circle : " + obj.areaOfCircle(35));
        System.out.println("Area Of Rectangle : " + obj.areaOfRectangle(25, 15.5));
        System.out.println("Area Of Square : " + obj.areaOfSquare(24.4));
    }

}
