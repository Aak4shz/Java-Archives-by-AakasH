// Write a Java Program to print Type 2. Array Declaration + Memory Allocation Together... 
public class Ch_Array_2 {
    public static void main(String[] args) {
        // Array Declaration + Memory Allocation Together

        int[] numbers = new int[10];
        // Initialize with even numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;

        }
        // Display the Array
        System.out.println("Even Numbers :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        // Calculate Sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("\nSum of all Even Numbers : " + sum);
    }

}
