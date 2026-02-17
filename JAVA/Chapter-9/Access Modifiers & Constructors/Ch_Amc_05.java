//! : Default Access Modifier

// Class with default access (accessible only within this package)
class DefaultModifierDemo {
    // Default fields: No keyword used
    String webName;
    int rank;

    // Default Constructor
    DefaultModifierDemo() {
        this.webName = "Java Archives";
        this.rank = 1;
        System.out.println("Default Constructor Called\n");
    }

    // Default Method
    void display() {
        System.out.println("Website: " + webName);
        System.out.println("Rank: " + rank);
    }
}

public class Ch_Amc_05 {
    public static void main(String[] args) {
        System.out.println("=== Default Access Modifier Demo ===\n");

        // Creating object of class with default access
        DefaultModifierDemo obj = new DefaultModifierDemo();

        // Accessing default fields directly (Allowed in same package)
        obj.webName = "Java-Archives-by-AakasH";
        obj.rank = 5;

        obj.display();
    }
}
