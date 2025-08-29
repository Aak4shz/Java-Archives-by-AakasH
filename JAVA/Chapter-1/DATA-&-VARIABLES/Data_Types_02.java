// A Java program to demonstrate the use of local variables...

public class Data_Types_02 {
        public static void main(String[] args) {
        // Calling the Method
        addNumbers(10, 20);
    }

    public static void addNumbers(int a, int b) {
        // Local variable 'total' declared and initialized
        int total = a + b;
        System.out.println("The sum of " + a + " and " + b + " is : " + total);
    }
}
