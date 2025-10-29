// Question 19 : Find Second Largest and Second Smallest Element
// Concept: Sort or use logic to get the 2nd largest and smallest numbers.
public class Practice_Ques_19 {
    public static void main(String[] args) {
        int[] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };

        System.out.println("Original Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Find Second Largest & Second Smallest Elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            // Check for Largest and Second Largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // Check for Smallest and Second Smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println();
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("\nNo second largest (all elements may be equal).");
        } else {
            System.out.println("\nSecond Largest Element is : " + secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest (all elements may be equal).");
        } else {
            System.out.println("Second Smallest Element is : " + secondSmallest);
        }
        System.out.println();
    }
}
