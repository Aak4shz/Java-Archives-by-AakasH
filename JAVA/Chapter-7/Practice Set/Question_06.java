/* Write a static method multiply(int a, int b) that returns the product of two numbers.
   Call it without creating an object.
 */
public class Question_06 {
    static void multiply(int a, int b) {
        int product = a * b;
        System.out.println("The product of " + a + " and " + b + " is : = " + product);
    }

    public static void main(String[] args) {
        multiply(5, 2);
        multiply(11, 10);
    }
}
