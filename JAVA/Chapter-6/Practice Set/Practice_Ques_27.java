
/* Question : 27 : 2D Array (Matrix Input and Display)
Concept:  Create a 2D array, take input from user, and display it in matrix form.
Hint:  Use nested loops — one for rows, one for columns. 
*/
import java.util.Scanner;

public class Practice_Ques_27 {

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int rows = zx.nextInt();

        System.out.print("Enter Number of Columns : ");
        int columns = zx.nextInt();

        int[][] matrix = new int[rows][columns];

        // Take Input from user using nested loops
        System.out.println("Enter elements of the matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at [" + i + " ][" + j + "] : ");
                matrix[i][j] = zx.nextInt();
            }
        }

        // Display Matrix in format
        System.out.println("\nMatrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        zx.close();

    }
}
