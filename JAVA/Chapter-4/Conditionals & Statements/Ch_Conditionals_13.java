public class Ch_Conditionals_13 {
    public static void main(String[] args) {
        // Use of Logical Not Operators -> !
        int age = 20;
        boolean Indian = true;

        if (!(age >= 18 && Indian)) {
            System.out.println("you are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}
