// Write a recursive method fibonacci(int n) that prints Fibonacci series up to n terms

import java.util.Scanner;

public class Question_18 {

    // Recursive method to calculate Fibonacci number at Position
    int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter number of terms for Fibonacci Series : ");
        int terms = zx.nextInt();
        Question_18 obj = new Question_18();
        System.out.println("Fibonacci Series up to " + terms + " terms : ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
        zx.close();
    }

}

/* 
 *  What is Fibonacci Series?
 *  Fibonacci Series is a sequence of numbers where:
 *  Every number after the first two is the sum of the previous two numbers.
 * 
 *  How Fibonacci Series works?
 *  *==== Formula =====*
 *  F(n) = F(n-1) + F(n-2)
    ======================
  Example : => n = 10 
  * F(0) = 0
  * F(1) = 1
  * F(2) = 1  (0 + 1)
  * F(3) = 2  (1 + 1)
  * F(4) = 3  (1 + 2)
  * F(5) = 5  (2 + 3)
  * F(6) = 8  (3 + 5)
  * F(7) = 13 (5 + 8)
  * F(8) = 21 (8 + 13)
  * F(9) = 34 (13 + 21)
  * F(10)= 55 (21 + 34)
 */
