/* Write a method isPrime(int n) that returns true if number is prime, otherwise false. */
public class Question_08 {
    static boolean isPrime(int n){
        if ( n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int num1 = 29;
        int num2 = 15;

        System.out.println(num1 + " is prime ? : " + isPrime(num1));
        System.out.println(num2 + " is prime ? : " + isPrime(num2));
        
    }
    
}
