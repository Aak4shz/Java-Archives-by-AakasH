/* Create a method maxOfThree(int a, int b, int c) to find the largest among three numbers. */
public class Question_09 {
    static void maxOfThree(int a, int b, int c){
        if (a >= b && a >= c){
            System.out.println(a + " is the largest number.");
        }
        else if ( b >= a && b >= c){
            System.out.println(b + " is the largest number.");
        }
        else if ( c >= a && c >= b){
            System.out.println(c + " is the largest number.");
        }
        else {
            System.out.println("All numbers are equal.");
        }
    }
    public static void main(String[] args) {
        maxOfThree(23, 45, 67);
        maxOfThree(98, 84, 73);
        maxOfThree(26, 88, 64);
    }
}
