// Two-Dimensional Array

public class Ch_Array_7 {
    public static void main(String[] args) {
        // Two-Dimensional Array (2D Array)
        int[][] Flats;

        Flats = new int[3][2];

        Flats[0][0] = 1;
        Flats[0][1] = 2;

        Flats[1][0] = 3;
        Flats[1][1] = 4;

        Flats[2][0] = 5;
        Flats[2][1] = 6;

        System.out.println("Printing 2-D Array using for loop : ");
        for (int i = 0; i < Flats.length; i++) {
            for (int j = 0; j < Flats[i].length; j++) {
                System.out.println(Flats[i][j]);
            }
            System.out.println();
        }

    }
}
