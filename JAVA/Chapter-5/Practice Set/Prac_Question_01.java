// Write a program to print the first 20 even numbers using a while loop.

public class Prac_Question_01 {
    public static void main(String[] args) {
        int i = 2;
        int count = 1;
        while (count <= 20) {
            System.out.print(i + " ");
            i += 2;
            count++;
        }
    }
}