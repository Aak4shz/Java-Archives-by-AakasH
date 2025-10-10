// Jagged Array - Arrays of Arrays
public class Ch_Array_8 {
    public static void main(String[] args) {

        // Create Jagged Array with 3 rows with different size of columns
        int[][] JaggedArray = new int[3][];

        // Define columns (each row has different size)
        JaggedArray[0] = new int[3]; // Row 1 -> 3 Columns
        JaggedArray[1] = new int[2]; // Row 2 -> 2 Columns
        JaggedArray[2] = new int[4]; // Row 3 -> 4 Columns

        // Initialize elements

        JaggedArray[0][0] = 10;
        JaggedArray[0][1] = 20;   
        JaggedArray[0][2] = 30;

        JaggedArray[1][0] = 40;
        JaggedArray[1][1] = 50;  

        JaggedArray[2][0] = 60;
        JaggedArray[2][1] = 70;
        JaggedArray[2][2] = 80;  
        JaggedArray[2][3] = 90;

        // Print Elements
        for (int i = 0; i < JaggedArray.length; i++) {
            for (int j = 0; j < JaggedArray[i].length; j++) {
                System.out.println(JaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Jagged Array : A Jagged Array is an array of arrays, where each inner array
 *                can have a different length.
 */