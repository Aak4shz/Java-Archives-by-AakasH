//! : Protected Access Modifier

class ProtectedModifiersDemo {
    protected String name;
    protected int age;
    protected double salary;

    public ProtectedModifiersDemo() {
        this.name = "Default Name";
        this.age = 0;
        this.salary = 12000.0;
        System.out.println("This is the protected default constructor called\n");
    }

    public ProtectedModifiersDemo(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("This is the protected parameterized constructor called\n");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age : " + age + ", Salary: " + salary);
    }
}

public class Ch_Amc_04 {
    public static void main(String[] args) {
        System.out.println("=== Protected Access Modifier Demo ===\n");

        // Using Default Constructor
        ProtectedModifiersDemo pmd1 = new ProtectedModifiersDemo();
        pmd1.displayInfo();

        System.out.println();

        // Using Parameterized Constructor
        ProtectedModifiersDemo pmd2 = new ProtectedModifiersDemo("Aakash", 25, 45000.0);
        pmd2.displayInfo();

        // Accessing protected members directly (Allowed in same package)
        System.out.println("\nAccessing protected field directly:");
        System.out.println("Name: " + pmd2.name);
        System.out.println("Salary: " + pmd2.salary);
    }
}
