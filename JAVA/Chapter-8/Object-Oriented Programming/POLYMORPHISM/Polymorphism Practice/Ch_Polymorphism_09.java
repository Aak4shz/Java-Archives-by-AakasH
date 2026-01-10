/* Question 5: Area Calculator (Overloading)

Create a class AreaCalculator with overloaded calculateArea() methods:

    calculateArea(int side) - Square area
    calculateArea(int length, int breadth) - Rectangle area
    calculateArea(double radius) - Circle area
    calculateArea(double base, double height) - Triangle area
 
 */

class AreaCalculator {
    // * Method Overloading -> Same method name with different parameters

    // Method to calculate the area of a square
    int calculateArea(int side) {
        return side * side;
    }

    // Method to calculate thew area of a rectangle (Overloaded method)
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a circle (Overloaded method)
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle (Overloaded method)
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Ch_Polymorphism_09 {

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Square Area : " + calc.calculateArea(5));
        System.out.println("Rectangle Area : " + calc.calculateArea(10, 8));
        System.out.println("Circle Area : " + calc.calculateArea(7.05));
        System.out.println("Triangle Area : " + calc.calculateArea(12.03, 18.05));
    }
}