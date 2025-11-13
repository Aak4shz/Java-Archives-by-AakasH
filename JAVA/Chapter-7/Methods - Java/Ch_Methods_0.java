// Methods -  Syntax and Examples...
public class Ch_Methods_0 {

    // This is a method (Syntax)
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // This is a method (Example)
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c;
        c = logic(a, b);
        System.out.println(c);

        int a1 = 54;
        int b1 = 45;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);
    }
}
/*
 * Methods are useful because they allow us to write code that can be reused
 * many times in a program, which helps to reduce code duplication and makes our
 * programs more efficient.
 * Simply - Write once time and use many times. (See in Code.)
 */
