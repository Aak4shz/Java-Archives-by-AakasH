/* 
 * Write a program that:
 * uses method overloading for calculate() to:
 * finds area or perimeter of triangle, circle, square and rectangle based on parameters.
 */
public class Question_20 {
    // Area of Triangle or Perimeter
    static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    static double calculateTrianglePerimeter(double base, double height, double hypotenuse) {
        return hypotenuse + base + height;
    }

    // Area of Circle or Circumference
    static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Area of Rectangle or perimeter
    static int calculateRectangleArea(int length, int breadth) {
        return length * breadth;
    }

    static int calculateRectanglePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    // Area of Square or Perimeter
    static int calculateSquareArea(int side) {
        return side * side;
    }

    static int calculateSquarePerimeter(int side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        Question_20 obj = new Question_20();
        System.out.println("--------------------------------------");

        System.out.println("Area of Triangle : " + obj.calculateTriangleArea(10, 25.8));
        System.out.println("Perimeter of Triangle : " + obj.calculateTrianglePerimeter(10, 25.8, 30.5));

        System.out.println("--------------------------------------");

        System.out.println("Area of Circle : " + obj.calculateCircleArea(161.5));
        System.out.println("Perimeter of Circle : " + obj.calculateCircumference(21.61));

        System.out.println("--------------------------------------");

        System.out.println("Area of Rectangle : " + obj.calculateRectangleArea(72, 43));
        System.out.println("Perimeter of Rectangle : " + obj.calculateRectanglePerimeter(25, 25));

        System.out.println("--------------------------------------");

        System.out.println("Area of Square : " + obj.calculateSquareArea(15));
        System.out.println("Perimeter of Square : " + obj.calculateSquarePerimeter(75));
        System.out.println("--------------------------------------");

    }

}
