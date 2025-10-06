// Write a Java Program to print type 3. Array Declaration + Initialization with values.
public class Ch_Array_3 {
    public static void main(String[] args) {
        int[] marks = { 85, 73, 70, 80, 90, 55, 73 };
        float[] marks2 = { 81.3f, 76.5f, 68.4f, 70.9f, 80.0f, 85.12f };
        String[] names = { "Rahul", "Sanjay", "Rajveer", "Nikhil", "Aakash", "Ajay" };

        // Print the Arrays

        System.out.println("Integer Numbers Arrays : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Integer Numbers [" + i + "] = " + marks[i]);
        }

        System.out.println("\nFloat Numbers Arrays : ");
        for (int i = 0; i < marks2.length; i++) {
            System.out.println("Float Numbers [" + i + "] = " + marks2[i]);
        }

        System.out.println("\nString Names Arrays : ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("String Names [" + i + "] = " + names[i]);
        }

        // Calculation
        int sum = marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[6];
        float sum1 = marks2[0] + marks2[1] + marks2[2] + marks2[3] + marks2[4] + marks2[5];
        System.out.println("\nSum of Integer Numbers : " + sum);
        System.out.println("Sum of Float Numbers : " + sum1);

        System.out.println("\nFirst Name : " + names[0]);
        System.out.println("Last Name : " + names[5]);

    }

}
