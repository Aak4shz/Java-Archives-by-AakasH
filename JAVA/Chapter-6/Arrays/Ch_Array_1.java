// Write a program to print type 1.Array Declaration then Memory Allocation Separately.
public class Ch_Array_1 {
    public static void main(String[] args) {
        // Array Declaration then Memory Allocation Separately

        String[] days;
        days = new String [7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";


        // Print Days..
        for ( int i = 0; i < days.length; i++){
            System.out.println((i + 1) + " : " + days[i]);
        }
    }
    
}
