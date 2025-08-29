// Write a Java Program to Add Numbers Using input from the User.

import java.util.Scanner;
public class Prac_Qna_02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       /* System.out.println("Input Tht First Numbers :");
        int num1 = sc.nextInt();
        System.out.println("Input The Second Numbers :");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println();
        System.out.println("The sum of Two Numbers is : "+ sum);   */

        System.out.print("Input the X number: ");
        int numX = sc.nextInt(); 
        System.out.print("Input the Y number: "); 
        int numY = sc.nextInt(); 
        System.out.print("Input the Z number: ");
        int numZ = sc.nextInt(); 
        int sum1 = numX + numY + numZ;
        
        System.out.println("The sum of three numbers is: " + sum1);

        sc.close();
     }
}
