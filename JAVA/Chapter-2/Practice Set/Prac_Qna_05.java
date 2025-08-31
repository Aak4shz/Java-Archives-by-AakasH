/* Take input of two integers and check:
Which is greater
Which is smaller
Whether they are equal or not .
 */
import java.util.Scanner;
    public class Prac_Qna_05 {
        public static void main(String[] args) {
            Scanner zx = new Scanner(System.in);
            System.out.println("Enter First Number : ");
            int num1 = zx.nextInt();

            System.out.println("Enter Second Number : ");
            int num2 = zx.nextInt();

            if(num1 > num2){
                System.out.println(num1 + " is greater.");
            }
            else if (num2 < num1){
                System.out.println(num2 + " is greater.");
            }
            else 
            System.out.println("Both are equal .");

            zx.close();
        }
    
}
