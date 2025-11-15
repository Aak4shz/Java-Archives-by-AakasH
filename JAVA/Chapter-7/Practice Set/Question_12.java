// Write a recursive method factorial(int n) that returns factorial of a number.
public class Question_12 {

    // Recursive method to calculate factorial
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Question_12 obj = new Question_12();
        int number = 5;
        int result = obj.factorial(number);
        System.out.println("Factorial of " + number + " is : " + result);
    }

}
