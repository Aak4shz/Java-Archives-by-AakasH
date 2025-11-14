/* Write a method add(int a, int b) that returns the sum of two numbers.
 * Call it from main() and print the result.
 */
public class Question_03 {
    static void add(int a , int b){
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is : = " + sum);

    }
    public static void main(String[] args) {
        add(10, 20);
        add(33, 77);

    }
    
}
