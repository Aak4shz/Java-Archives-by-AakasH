// Print Triangle pattern using for loops.

public class Ch_Loops_14 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(); // new line after each row
        }
    }

}
