// Write a program to print first 10 odd numbers using while loop.

public class Prac_Question_06 {
    public static void main(String[] args) {
        int i = 1;
        int count = 1;

        while(count <= 10){
            System.out.print(i + " ");
            i += 2;
            count++;
        }
        
    }
}
