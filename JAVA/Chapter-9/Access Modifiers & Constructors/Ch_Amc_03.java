// 2. Access Modifiers & Constructors
    //! Type 2 -> Public Modifier

class PublicDemo {
    // Public variables: Can be accessed from any other class in any package
    public String message = "Hello, I am Public!";

    // Public method: Can be called from anywhere
    public void displayMessage() {
        System.out.println(message);
    }
}

public class Ch_Amc_03 {
    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();

        // Accessing public variable directly
        System.out.println("Accessing Variable: " + obj.message);

        // Modifying public variable directly
        obj.message = "Public data modified easily!";
        System.out.println("Modified Variable: " + obj.message);

        // Calling public method
        obj.displayMessage();
    }
}
