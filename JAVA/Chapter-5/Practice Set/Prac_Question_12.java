// WAP to Display the Fibonacci series up to n terms using a loop. 

public class Prac_Question_12 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + n + " terms : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;

        }

    }

}

/*
 * Fibonacci series :- It is a sequence of numbers where.
 * Each number = sum of the previous two numbers.
 */