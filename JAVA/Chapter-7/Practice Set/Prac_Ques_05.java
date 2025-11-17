// Write a function to print (n)th Number in the Fibonacci Series using Recursion.
public class Prac_Ques_05 {
    static int fib(int n) {
        /*
         * if (n == 1) {
         * return 0;
         * } else if (n == 2) {
         * return 1; *
         * }
         */

        // another way to write this is

        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = fib(10);
        System.out.println(result);
    }
}
