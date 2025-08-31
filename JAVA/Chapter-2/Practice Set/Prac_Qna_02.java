/* Write a Java program that:
Prints a welcome message.
Calculates and prints the sum and product of three integers.
Divides two numbers and prints the result.
Simplifies and prints the results of four arithmetic expressions. */

public class Prac_Qna_02 {
    public static void main(String[] args) {
    System.out.println("Hello Aakash !");
    System.out.println("Welcome to VS Code.");
    System.out.println("Please write code with me.");

    // QUESTION NO 1
    int a = 45;
    int b = 80;
    int c = 20;
    int result = (a + b + c);
    System.out.println("The result is ");
    System.out.println(result);

    // QUESTION NO 2
    // Division of two number
    int a1 = 50;
    int b2 = 3;
    float Division = (a1 / (float)b2);
    System.out.println("Division of numbers");
    System.out.println(Division);

    // QUESTION NO 3
    // simplify Arithmetic operation
    // a. -5 + 8 * 6
    int result1 = -5 + 8 * 6;
    System.out.println("The Result1 is : " + result1);

    // b. (55+9) % 9
    int result2 = (55 + 9) % 9;
    System.out.println("The Result2 is : " + result2);

    // c. 20 + -3 * 5 / 8
    int result3 = 20 + -3 * 5 / 8;
    System.out.println("The Result3 is : " + result3);

    // d. 5 + 15 / 3 * 2 - 8 % 3
    int result4 = 5 + 15 / 3 * 2 - 8 % 3;
    System.out.println("The Result4 is : " + result4);

    // Product of given number
    int result5 = (a * b * c);
    System.out.println("The Result5 is : " + result5);
  }
}

/* OUTPUT :-
Hello Aakash !
Welcome to VS Code.
Please write code with me.
The result is 
145
Division of numbers
16.0
The Result1 is : 43
The Result2 is : 1
The Result3 is : 19
The Result4 is : 13
The Result5 is : 72000

 */