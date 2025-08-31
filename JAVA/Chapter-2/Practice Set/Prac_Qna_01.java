/*  Write a java program to print all arithmetic operations like addition, subtraction, multiplication,
 division, modulus, power and mod.  */

import java.util.Scanner;
   public class Prac_Qna_01 {

    public static void main(String[] args) {

        java.util.Scanner xz = new Scanner(System.in);
        System.out.print("Enter the first Numbers :");
        int num1 = xz.nextInt();

        System.out.print("Enter the Second Numbers :");
        int num2 = xz.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        System.out.println(num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));

        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

        xz.close();

    }

}
/* OUTPUT Example :- 
Enter the first Numbers :5
Enter the Second Numbers :2
5 + 2 = 7
5 - 2 = 3
5 * 2 = 10
5 / 2 = 2
5 % 2 = 1
5 ^ 2 = 25.0
5 mod 2 = 1
 */
