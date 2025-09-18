// Write a program to input three sides of a triangle and check whether 
// the triangle is equilateral, isosceles, or scalene.

import java.util.Scanner;

public class Practice_Question_12 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Side A : ");
        int a = zx.nextInt();

        System.out.print("Enter the Side B : ");
        int b = zx.nextInt();

        System.out.print("Enter the Side C : ");
        int c = zx.nextInt();

        if (a + b > c && b + c > a && c + a > b) { // validity of triangle
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral Triangle.");
            } else if (a == b || b == c || c == a) {
                System.out.println("The triangle is Isosceles Triangle.");
            } else {
                System.out.println("The triangle is Scalene Triangle.");
            }
        } else {
            System.out.println("The Triangle is Invalid.");
        }
        zx.close();

    }

}

// Equilateral Triangle :- All Sides are Equals.
// Isosceles Triangle :- Any two sides are Equals.
// Scalene Triangle :- All sides are Different.