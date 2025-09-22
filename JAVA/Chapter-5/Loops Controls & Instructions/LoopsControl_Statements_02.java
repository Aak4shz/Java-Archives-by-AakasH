// Control Statements in Loops...
// 2. Continue statements.

public class LoopsControl_Statements_02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            if (i == 5){
                System.out.println("End of Loop.");
                continue; // Skips the rest of the loop when i is 5. 
            }
            System.out.println(i);
            System.out.println("Hello Sachin Chutmarike !");
        }

    }
    
}

/* The continue statement does not end the loop (unlike break).
   It simply skips the rest of the code in the current iteration.
   After that, the control directly moves to the next iteration of the loop.

 In short: => “continue means: skip this turn, go to the next turn.” 
 */
