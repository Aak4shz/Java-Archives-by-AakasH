
/* Question 29 : Transpose of a Matrix
Concept: Convert all rows into columns and columns into rows.
Hint: transpose[j][i] = matrix[i][j];
 */
import java.util.Scanner;

public class Practice_Ques_29 {
    public static void main(String[] args) {

        Scanner zx = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = zx.nextInt();

        System.out.print("Enter Number of columns : ");
        int columns = zx.nextInt();

        int[][] matrix = new int[rows][columns];

        // Take Input for the Original matrix
        System.out.println("Enter elements of the Matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "] : ");
                matrix[i][j] = zx.nextInt();
            }
        }

        // Create Transpose Matrix
        int[][] transpose = new int[columns][rows];

        // Swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the Original Matrix
        System.out.println("\nOriginal Matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display the Transposed Matrix
        System.out.println("\nTransposed Matrix : ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        zx.close();

    }
}
