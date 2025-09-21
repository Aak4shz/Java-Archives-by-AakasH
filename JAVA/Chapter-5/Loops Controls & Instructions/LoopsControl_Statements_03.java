// Control Statements in Loops...
// 3. Return Statement.

public class LoopsControl_Statements_03 {
    public static void findEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("First even number is : " + i);
                return;
            }
        }
        System.out.println("No even number found .");
    }

    public static void main(String[] args) {
        findEven(5);
    }

}
/*
 * The return statement is used to end a method and send control back to the
    place where the method was called.

 * If the method is supposed to give back a value, return also sends that value.
 * When return is executed, the program stops running the method immediately.
 * In short: => “return means: stop this method here and go back, possibly with a value.”
 */
