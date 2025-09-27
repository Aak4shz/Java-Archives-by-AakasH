// Write a program to print character (Alphabets) and numbers both using while loop.

public class Prac_Question_04 {
    public static void main(String[] args) {
        
        char ch = 'A';
        int num = 1;
        while (ch <= 'Z' && num <= 26){
            System.out.print(ch + " " + num);
            ch++;
            num++;
            System.out.println();
        }
    }
}
