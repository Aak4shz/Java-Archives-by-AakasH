// Employee class demonstrating Access Modifiers and Constructors
class Employee {
    // Access Modifiers Demo
    private int id;           // Private - only this class
    public String name;       // Public - accessible anywhere
    protected double salary;  // Protected - package + subclasses
    int age;                  // Default - package only

    // Default Constructor - no parameters
    public Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor - with parameters
    public Employee(int id, String name, double salary, int age) {
        this.id = id;           // 'this' refers to instance variable
        this.name = name;
        this.salary = salary;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // Display all employee details
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary + " | Age: " + age);
    }

    // Getter - to access private field from outside
    public int getId() {
        return id;
    }
}

public class Ch_Amc_01 {
    public static void main(String[] args) {
        // Using Default Constructor
        Employee emp1 = new Employee();
        emp1.displayInfo();

        // Using Parameterized Constructor
        Employee emp2 = new Employee(101, "Aakash", 55000.50, 22);
        emp2.displayInfo();

        // Accessing fields based on modifiers
        emp2.name = "Aakash Kumar";   // Public - direct access
        emp2.age = 23;                // Default - same package access
        // emp2.id = 102;             // Private - NOT accessible (Error)
        
        System.out.println("Updated Name: " + emp2.name);
        System.out.println("Private ID via Getter: " + emp2.getId());
    }
}
