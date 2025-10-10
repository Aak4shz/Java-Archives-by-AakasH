// Arrays Operations --> Traversing an Array,Copying Arrays,Sorting Arrays & Searching Arrays .
public class Ch_Array_9 {
    public static void main(String[] args) {
        // Traversing an Array
        int[] marks = { 90, 75, 80, 83, 77, 95, };
        System.out.println("Traversing an Array : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject:[" + i + "] = " + marks[i]);
        }

        // Sum of Marks Calculations 
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        System.out.println("\nTotal Marks : " + sum);
        System.out.println("Number of Subjects : " + marks.length);
    }

}

/* Traversing an array means accessing each element of the array one by one,
 * usually to read, print, or process the data.
 */