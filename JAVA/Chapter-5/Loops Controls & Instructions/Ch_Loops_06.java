// Using Do-While loops in java : -
public class Ch_Loops_06 {
    public static void main(String[] args) {
        int a = 0;    // Initialization → starting value is 0
        do {
            System.out.println(a);   // Print current value of 'a'
            a++;                   // Increment 'a' by 1
        } while (a <= 11);       // Condition check happens AFTER running the loop body
    }
}
// This loop will print numbers from 0 to 11.

/*  The loop body executes at least once, even if the condition is false.
    (Because condition is checked after the block).
    

    Difference between while & do-while loop:
    while → checks condition first, then executes.
    do-while → executes first, then checks condition.
    
    
    */