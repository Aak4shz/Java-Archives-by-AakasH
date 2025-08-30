// Program to demonstrate Data Types after Arithmetic Operations and Increment/Decrement Operators in Java

public class Operator_Ch_02 {
    public static void main(String[] args) {

    /*---------------------------------------------
      Data Type Conversions in Arithmetic Operations
    -----------------------------------------------*/

    // int + byte --> int 
    int a = 11;
    byte b = 22;
    int result = a + b;
    System.out.println("Result of a + b is " + result);

    // int + short --> int 
    int a2 = 11;
    short z1 = 100;
    int result2 = a2 + z1;
    System.out.println("Result of a2 + z1 is " + result2);

    // long + float --> float
    long q = 1000000000;
    float s = 10.5f;
    float result3 = s + q;
    System.out.println("Result of s + q is " + result3);

    // int + float --> float
    int a3 = 55;
    float s2 = 10.5f;
    float result4 = a3 + s2;
    System.out.println("Result of a3 + s2 is " + result4);

    // char + short --> int
    char a4 = 'A';
    short z2 = 100;
    int result5 = a4 + z2;
    System.out.println("Result of a4 + z2 is " + result5);

    // int + char --> int
    int t = 100;
    char n = 'A';
    int result6 = t + n;
    System.out.println("Result of t + n is " + result6);

    // long + double --> double
    long q2 = 1000000000;
    double s3 = 10.5d;
    double result7 = q2 + s3;
    System.out.println("Result of q2 + s3 is " + result7);

    // float + double --> double
    float a5 = 10.5f;
    double k = 100.5d;
    double result8 = a5 + k;
    System.out.println("Result of a5 + k is " + result8);

     /*---------------------------------------------
       Increment and Decrement Operators
       ---------------------------------------------*/

    // Example 1: Prefix + Postfix Combination
    int i = 99;
    int j = 100;
    int d = ++j + i++;
    System.out.println("Value of d is " + d);
    System.out.println(i);
    System.out.println(j);

    // Example 2: Prefix + Postfix with Decrement
    int x = 100;
    int y = 200;
    int z3 = --y + x--;
    System.out.println("Value of z3 is " + z3);
    System.out.println(x);
    System.out.println(y);

  }
}