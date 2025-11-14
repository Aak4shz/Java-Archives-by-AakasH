/* Write a program with:

class Calculator {
    int add(int a, int b) { ... }
    int subtract(int a, int b) { ... }
}

Call both methods using an object and display results.
 */
public class Question_07 {
    static int add(int a , int b){
        return a + b;
    }
    static int subtract(int a , int b){
        return a - b;
    }
    public static void main(String[] args) {
        int sum = add(25, 75);
        System.out.println("The sum of 25 and 75 is : = " + sum);

        int difference = subtract(100, 75);
        System.out.println("The difference of 100 and 75 is : = " + difference); 
    }
    
}
