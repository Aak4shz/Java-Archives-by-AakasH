/* Write a program to input two numbers and print:
Sum
Difference
Product
Quotient
Remainder
 */
import java.util.Scanner;
  public class Prac_Qna_04 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = zx.nextInt();

        System.out.print("Enter Second Number : ");
        int b = zx.nextInt();

        System.out.println("Sum : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product : " + (a * b));
        System.out.println("Quotient : " + (a / b));
        System.out.println("Remainder : " + (a % b));

        zx.close();
        
    }
}
// OUTPUT :- Based on User Input.