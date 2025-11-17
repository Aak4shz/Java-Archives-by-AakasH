// Write a java program to print a pattern of star increasing by one in each row .

public class Prac_Ques_02 {
    static void pattern1(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(10);
    }
}
