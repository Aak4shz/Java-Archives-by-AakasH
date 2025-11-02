/* Question 25 : Copying Array using System.arraycopy()
    Concept: Copy one array into another using Java’s built-in System.arraycopy() method.
    Hint: Syntax → System.arraycopy(source, srcPos, destination, destPos, length);  */

public class Practice_Ques_25 {
    public static void main(String[] args) {
        int [] sourceArray = { 7, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61,67, 71, 73, 79, 83, 89, 97, };
        int [] destinationArray = new int [sourceArray.length];
        System.out.println("Source Array Elements : ");
        for ( int num : sourceArray ){
            System.out.print(num + " ");
        }

        // Copying Array Using System.arraycopy()
        System.out.println("\n\nCopying Array using System.arraycopy() method...");

        System.arraycopy(sourceArray, 0, destinationArray, 0, 0);
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        
        System.out.println("Array Copied Successfully!");
        System.out.println("\nDestination Array Elements : ");
        for ( int num : destinationArray ){
            System.out.print(num + " ");
        }


    }
    
}
