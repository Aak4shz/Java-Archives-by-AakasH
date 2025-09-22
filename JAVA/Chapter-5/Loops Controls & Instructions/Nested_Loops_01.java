// Nested Loops in java... -> A loops inside another loop.

public class Nested_Loops_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + " , j = " + j);
            }
            System.out.println("------------------");
        }
    }

}
/*
 * Definition: A loop written inside another loop is called a Nested Loop.
 * 
 * In short: “Loop inside a Loop.”
 * 
 * The outer loop runs once, and for each iteration of the outer loop, the inner
 * loop runs completely.
 * 
 * Example use cases: printing patterns, working with 2D arrays, repeating
 * tasks inside tasks.
 */
