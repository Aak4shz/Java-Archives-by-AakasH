/*Repeat Question no 2 .
 Write a function to print the following the pattern using the recursion.
 *
 * *
 * * *
 * * * *
 * * * * *

*/
public class Prac_Ques_08 {
    static void function(int n) {
        if (n == 0) {
            return;
        }
        function(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        function(8);
    }
}
