/* Repeat Question No 3 .
 Write a recursive function to calculate the sum of the first ( N ) natural numbers.
 Using iterative approach,
 */

public class Prac_Ques_10 {

    static int sumIterative(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 26;
        int result = sumIterative(N);
        System.out.println(" The sum of the first " + N +
                " natural number is : " + result);
    }

}
