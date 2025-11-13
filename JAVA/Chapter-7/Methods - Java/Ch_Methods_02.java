// This class contains methods to calculate the sum of variables
// The methods are overloaded to handle different number of parameters
// The last method uses varargs to handle any number of parameters
public class Ch_Methods_02 {
    
   /*  static int sum(int a, int b) {
        return a + b;
    }
        static int sum(int a, int b ,int c) {
        return a + b + c;
    }

        static int sum(int a, int b , int c , int d) {
        return a + b + c + d;
    }  */

    static int sum (int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to my Java program!");
        System.out.println("The sum of 5 and 11 is :" + sum(5, 11));
        System.out.println("The sum of 5, 11 and 14 is :" + sum(5,11,14));
        System.out.println("The sum of 5, 11, 14 and 20 is : " + sum(5, 11, 14, 20));

    }
}
