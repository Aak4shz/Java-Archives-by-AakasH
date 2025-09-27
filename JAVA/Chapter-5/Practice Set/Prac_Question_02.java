// Write  a program to print Alphabet from A to Z & reverse a to z both using while loop.

public class Prac_Question_02 {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = 'z';
        while (ch <= 'Z' && ch1 >= 'a') {
            System.out.print(ch + " " + ch1 + " ");
            ch++;
            ch1--;
            System.out.println("");
        }
    }
}
