// Implement multilevel inheritance: create classes Animal, Mammal, 
// and Dog such that Dog inherits from Mammal, which inherits from Animal.​

class Animal {
    // Properties
    protected String name;
    protected int age;

    // Default Constructor
    public Animal() {
        System.out.println("Animal constructor called");
    }

    // Parameterized Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal parameterized constructor called.");
    }

    // Methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " years");
    }
}

// Intermediate Class - Mammal (inherits Animal)
class Mammal extends Animal {
    // Additional properties
    protected boolean isWarmBlooded;

    // Default Constructor
    public Mammal() {
        super();
        System.out.println("Mammal constructor called.");
    }

    // Parametrized Constructor
    public Mammal(String name, int age, boolean isWarmBlooded) {
        super(name, age);
        this.isWarmBlooded = isWarmBlooded;
        System.out.println("Mammal parameterized constructors called.");
    }

    // Mammal - Specific Methods
    public void giveBirth() {
        System.out.println(name + " gives birth to living young.");
    }

    public void feedMilk() {
        System.out.println(name + " feeds milk to its babies.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warm Blooded : " + isWarmBlooded);
    }
}

// Derived Class - Dog (inherits Mammal)
class Dog extends Mammal {
    // Additional properties
    private String breed;
    private String color;

    // Default Constructor
    public Dog() {
        super();// Calls Mammal constructor
        System.out.println("Dog constructor called.");
    }

    // Parametrized Constructor
    public Dog(String name, int age, boolean isWarmBlooded, String breed, String color) {
        super(name, age, isWarmBlooded);
        this.breed = breed;
        this.color = color;
        System.out.println("Dog Parametrized constructor called.");
    }

    // Dog Specific methods
    public void bark() {
        System.out.println(name + " says : Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    public void wagTail() {
        System.out.println(name + " is wagging its tail happily!");
    }

    // Override displayInfo to include all details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls Mammal's displayInfo
        System.out.println("Breed : " + breed);
        System.out.println("Color : " + color);
    }
}

public class QuestionNo_5 {
    public static void main(String[] args) {
        System.out.println("===== CONSTRUCTOR CHAINING DEMO =====");
        System.out.println("Creating a Dog object...\n");

        // Create Dog Object with parameterized constructor
        Dog myDog = new Dog("Jimmy", 3, true, "Labrador", "Golden and White");
        System.out.println("\n===== DOG ALL INFORMATION ======");
        myDog.displayInfo();

        System.out.println("\n===== METHODS INHERITED FROM ANIMAL =====");
        myDog.eat(); // from Animal class
        myDog.sleep(); // from Animal class

        System.out.println("\n===== METHODS INHERITED FROM MAMMAL =====");
        myDog.giveBirth(); // from Mammal class
        myDog.feedMilk(); // from Mammal class

        System.out.println("\n===== DOG'S OWN METHODS =====");
        myDog.bark(); // Dog's own methods
        myDog.fetch(); // Dog's own methods
        myDog.wagTail(); // Dog's own methods

        System.out.println("\n===== CREATING ANOTHER DOG =====");
        Dog dog2 = new Dog("Max", 5, true, "German Shepherd", "Black and Brown");
        System.out.println();
        dog2.displayInfo();
        dog2.bark();
        System.out.println();
    }
}
