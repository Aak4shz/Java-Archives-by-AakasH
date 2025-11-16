/* 
* Create a class MathOperations having:
* input() → take two numbers
* add(), subtract(), multiply(), divide() → perform operations
* display() → show results 
*/

class MathOperations {
    int num1, num2;
    int sum, difference, product, divided;

    void input(int a, int b) {
        num1 = a;
        num2 = b;

    }

    void add() {
        sum = num1 + num2;
        System.out.println("Sum : " + sum);
    }

    void subtract() {
        difference = num1 - num2;
        System.out.println("Difference : " + difference);
    }

    void multiply() {
        product = num1 * num2;
        System.out.println("Product : " + product);
    }

    void divide() {
        if (num1 > num2) {
            divided = num1 / num2;
            System.out.println("Division : " + divided);
        } else if (num2 > num1) {
            divided = num2 / num1;
            System.out.println("Division : " + divided);
        } else {
            System.out.println("Both numbers are equal, Division result is 1");
        }
    }

}

public class Question_17 {
    public static void main(String[] args) {
        MathOperations MO = new MathOperations();
        MO.input(20, 05);
        MO.add();
        MO.subtract();
        MO.multiply();
        MO.divide();

    }

}
