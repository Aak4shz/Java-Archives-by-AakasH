// Create a class Circle with methods to initialize its radius , calculating area ,perimeter, etc.

class Circle {
    int radius;

    public double area() {
        return Math.PI * radius * radius;

    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Prac_Ques_05 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 35;
        System.out.println("Area of Circle is : " + c.area());
        System.out.println("perimeter of Circle is : " + c.perimeter());
    }

}