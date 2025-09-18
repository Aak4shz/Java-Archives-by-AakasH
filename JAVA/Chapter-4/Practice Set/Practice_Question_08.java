// Write a program to implement a simple calculator using switch (operations: +, –, ×, ÷).

import java.util.Scanner;

public class Practice_Question_08 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        double num1 = zx.nextDouble();

        System.out.print("Enter the Operator (+, -, *, /) : ");
        char op = zx.next().charAt(0);

        System.out.print("Enter Second Number :");
        double num2 = zx.nextDouble();

        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);

                } else {
                    System.out.println(" Error !");
                }
                break;

            default:
                System.out.println("Invalid Operator !");
                break;

        }
        zx.close();
    }
}
