// Control Statements in Loops... 
// 1. Break statement

public class LoopsControl_Statements_01 {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
            if (ch == 'O') { // condition to check
                break; // Terminates the loops when ch is 'O'
            }

        }
        System.out.println("\nLoops terminated.");

    }
}

/* The break statement is used to end the loop immediately.
   As soon as break is executed, the loop stops running, no matter what the condition is.
   The control then jumps to the first line after the loop.

 In short: => “break means: stop the loop right now and get out.”
 */
