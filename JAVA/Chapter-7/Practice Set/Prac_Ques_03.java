// Write a java program a recursive function to calculate the sum of the first n natural numbers.

public class Prac_Ques_03 {
    static int sumRec(int n) {
        // Base condition

        if (n == 1) {
            return 1;
        }
        // Recursive case
        // sumRec(n) = n + sumRec(n - 1)
        return n + sumRec(n - 1);
    }

    public static void main(String[] args) {
        int x = sumRec(11);
        System.out.println(x);
    }
}
