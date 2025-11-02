
/* Question 30 : Find Element in 2D Array
Concept: Search a given number in a matrix (2D array) and print its row and column position. 
*/
import java.util.Scanner;

public class PracTice_Ques_30 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int row = zx.nextInt();

        System.out.print("Enter Number of Columns : ");
        int column = zx.nextInt();

        int[][] matrix = new int[row][column];

        // Take from the user input
        System.out.println("Enter elements of the matrix :  ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element at [" + i + "][" + j + "] : ");
                matrix[i][j] = zx.nextInt();
            }
        }

        // Print the Matrix

        System.out.println("\nMatrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Get the NUmber to Search :-
        System.out.print("\nEnter the Number to Search : ");
        int searchElement = zx.nextInt();
        boolean found = false;

        int rowIndex = -1;
        int columnIndex = -1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == searchElement) {
                    found = true;
                    rowIndex = i;
                    columnIndex = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Element " + searchElement + " found at index [" + rowIndex + "][" + columnIndex + "]");
            System.out.println("Row : " + rowIndex + ",  Column : " + columnIndex);
        } else {
            System.out.println("Element " + searchElement + " not found in the matrix.");
        }
        System.out.println();
        zx.close();
    }
}
