/* Write a program to create a method square(int num) that returns the square of the number.*/
public class Question_04 {
    static void square(int num) {
        int sq = num * num;
        System.out.println("The square of " + num + " is : =  " + sq);
    }

    public static void main(String[] args) {
        square(5);
        square(12);
    }

}
