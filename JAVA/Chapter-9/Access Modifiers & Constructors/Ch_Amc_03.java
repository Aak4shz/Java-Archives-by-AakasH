// Demo: Public Access Modifier
class PublicModifierDemo {
    
    // Public fields: accessible everywhere
    public String name;
    public int age;
    
    public PublicModifierDemo() {
        this.name = "Default Name";
        this.age = 0;
        System.out.println("This is the Public Default Constructor called\n");
    }
    
    public PublicModifierDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is the Public Parameterized Constructor called\n");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public String getName() {
        return name;
    }
    
    public static void staticMethod() {
        System.out.println("Public static method called");
    }
}

public class Ch_Amc_03 {
    public static void main(String[] args) {
        System.out.println("=== Public Constructor and Access Modifier Demo ===\n");
        
        // Using default constructor
        PublicModifierDemo obj1 = new PublicModifierDemo();
        obj1.displayInfo();
        
        // Using parameterized constructor
        PublicModifierDemo obj2 = new PublicModifierDemo("John", 25);
        obj2.displayInfo();
        
        // Direct access to public fields
        obj2.name = "Jane";
        obj2.age = 30;
        System.out.println("\nAfter modifying public variables:");
        obj2.displayInfo();
        
        System.out.println("\nGetting name via public method: " + obj2.getName());
        
        PublicModifierDemo.staticMethod();
    }
}