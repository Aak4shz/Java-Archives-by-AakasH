/*   Recursion Method - A method that calls itself until a stopping criterion is met.
 *   It is used to solve problems that can be broken down into smaller sub-problems.
 *   Recursion is often used to solve problems with a tree or graph structure.

 *   factorial (n) = n * n - 1 * n - 2 * ... *1
 *   factorial (5) = 5 * 4 * 3 * 2 * 1 = 120.
 *   factorial (n) = n * factorial(n - 1). 
 */

public class Ch_Methods_05 {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Iterative approach to calculate factorial.
    // This approach uses a loop to calculate the factorial.
    static int factorial_iterative(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(" The factorial of " + x + " is :" + factorial(x));
        System.out.println(" The factorial of " + x + " is :" + factorial_iterative(x));
        System.out.println("-------------------------------------------------------");
        System.out.println(" The factorial of " + y + " is :" + factorial(y));
        System.out.println(" The factorial of " + y + " is :" + factorial_iterative(y));
    }
}
/*
 * The iterative approach is used when we need to calculate the factorial of a
 * large number,
 * because it avoids the risk of a stack overflow that can occur with the
 * recursive approach.
 */