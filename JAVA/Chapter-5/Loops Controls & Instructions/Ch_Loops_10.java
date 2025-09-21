// Print stars in a triangle shape using do-while loops
public class Ch_Loops_10 {
    public static void main(String[] args) {
        int n = 6; // Total number of rows in the triangle
        int i = 1; // Row counter (starting from the first row)

        do {
            int j = 1; // Column counter (used to print stars in each row)
            do {
                System.out.print(" * "); // Print a star followed by a space
                j++; // Move to the next column
            } while (j <= i); // Print stars equal to the current row number

            System.out.println(); // Go to the next line after finishing one row
            i++; // Move to the next row
        } while (i <= n); // Repeat until all rows are printed
    }
}
