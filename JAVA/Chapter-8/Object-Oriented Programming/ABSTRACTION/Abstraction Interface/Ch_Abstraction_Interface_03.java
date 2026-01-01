// Interface wih variables and methods

interface Calculator {
    // Variable in interface are : public static final (Constants)
    double PI = 3.14159;

    // Abstract Methods
    int add(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    double divide(int a, int b);
}

class myCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return a / b;
    }
}

public class Ch_Abstraction_Interface_03 {
    public static void main(String[] args) {
        Calculator calc = new myCalculator();

        System.out.println("Addition : " + calc.add(1484, 8371));
        System.out.println("Subtraction : " + calc.subtract(971584, 652792));
        System.out.println("Multiplication : " + calc.multiply(75846, 3514));
        System.out.println("Division : " + calc.divide(75952, 131));
        System.out.println("Value of PI : " + Calculator.PI);
        System.out.println();
    }
}
