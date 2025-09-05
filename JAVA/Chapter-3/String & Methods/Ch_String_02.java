// Different Ways to print a String in java .

public class Ch_String_02 {
    public static void main(String[] args) {
        String firstName = new String("Aakash");
        String fullName = "Aakash Munda";
        int age = 22;

        // Using (System.out.print)
        System.out.print("My name is : ");
        System.out.print(firstName);
        System.out.print("\n" + fullName);
        System.out.print("\n--------------------------------");// use for new line or line break

        // Using (System.out.println)
        System.out.println(firstName + " That's my name .");
        System.out.println("And I am " + age + " years old.");
        System.out.println("--------------------------------"); // use for new line or line break


        // Using (System.out.printf)
        System.out.printf("\nMy name is : " + firstName);
        System.out.printf("\nMy age is : %d ", age);
        System.out.printf("\n--------------------------------"); // use for new line or line break

        // Using (System.out.format)
        System.out.format("\nMy name is : " + firstName);
        System.out.format("\nMy age is : %d ", age);
    }

}