//Write a function to print the following pattern .
// * * * * *
// * * * *
// * * *
// * *
// *
public class Prac_Ques_04 {

    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2(5);
    }
}
