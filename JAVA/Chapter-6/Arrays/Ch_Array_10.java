// Copying Arrays 
public class Ch_Array_10 {
    public static void main(String[] args) {
        // Original Array
        int[] Numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println("Original Array : ");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }
        // 1.| >--> Copy Using a Loop
        int[] copy1 = new int[Numbers.length];
        for (int i = 0; i < Numbers.length; i++) {
            copy1[i] = Numbers[i];
        }

        // 2.| >--> Copy Using System.arraycopy()
        int[] copy2 = new int[Numbers.length];
        System.arraycopy(Numbers, 0, copy2, 0, Numbers.length);

        // 3.| >--> Copy Using Arrays.copyOf() method
        int[] copy3 = java.util.Arrays.copyOf(Numbers, Numbers.length);

        // 4.| >--> Copy Using Clone() Method
        int[] copy4 = Numbers.clone();

        // Display all Copied Arrays
        System.out.println("\n\nCopied Arrays : ");

        System.out.print("Copying using Loop : ");
        for (int num : copy1) {
            System.out.print(num + " ");
        }
        System.out.print("\nCopy using System.arraycopy(): ");
        for (int num : copy2) {
            System.out.print(num + " ");
        }
        System.out.print("\nCopy using Arrays.copyOf(): ");
        for (int num : copy3) {
            System.out.print(num + " ");
        }
        System.out.print("\nCopy using Clone(): ");
        for (int num : copy4) {
            System.out.print(num + " ");
        }
    }

}

/*
 * Copying Arrays :- Copying an array means creating another array and putting
 *                   all the elements of one array into the other.
 */