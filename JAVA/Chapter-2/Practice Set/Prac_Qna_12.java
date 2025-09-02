// Write a java program to find the largest among three numbers.

import java.util.Scanner;

public class Prac_Qna_12 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter three Numbers : ");

        int num1 = zx.nextInt(0);
        int num2 = zx.nextInt(0);
        int num3 = zx.nextInt(0);

        if (a >= b && a >= c ){
            System.out.println(a + " is the largest number .");
        }
        else if (b >= a && b >= c ){
            System.out.println(b + " is the largest number .");
        }
        else {
            System.out.println(c + " is the largest number .");
        }
        zx.close();


        
    }
}
