
// Create a class Square with a method to initialize its side, calculating area , perimeter etc.

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

public class Prac_Ques_03 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 10;
        System.out.println("Area of Square is : " + sq.area());
        System.out.println("Perimeter of Square is : " + sq.perimeter());
    }
}
