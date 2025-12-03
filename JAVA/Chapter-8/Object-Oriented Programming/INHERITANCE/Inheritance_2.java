/*  
 * Create a class Animal and Derive another class from Animal named Dog.
 * Create a method in Animal named makeNoise() and override it in Dog.
 * Create a method in Dog named fetch() and call it in main.
 * Create a method in Animal named sleep() and override it in Dog.
 * Create a method in Dog named run() and call it in main.
 * Create a method in Animal named eat() and override it in Dog.
 * Create a method in Dog named bite() and call it in main.
*/

class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to overridden in Dog class
    public void makeNoise() {
        System.out.println(name + " is making some noise.");
    }

    // Method to overridden in Dog class
    public void sleep() {
        System.out.println(name + "is sleeping peacefully.");
    }

    // Method to Overridden in Dog class
    public void eat() {
        System.out.println(name + "is eating food.");
    }
}

// Child class - Dog (Derived Animal)
class Dog extends Animal {
    // constructor
    public Dog(String name) {
        super(name); // calling parent class constructor
    }

    // Overriding makeNoise method
    public void makeNoise() {
        System.out.println(name + " is barking : Woof ! Woof !");
    }

    // Overriding sleep method
    public void sleep() {
        System.out.println(name + " is sleeping in dog house.");
    }

    // Overriding eat method
    public void eat() {
        System.out.println(name + " is eating Meat and Bones.");
    }

    //Dog Specific method - fetch
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    // Dog Specific method - run
    public void run() {
        System.out.println(name + " is running in the park.");
    }

    // Dog specific method - bite
    public void bite() {
        System.out.println(name + " is biting the person.");
    }
}

public class Inheritance_2 {
    public static void main(String[] args) {

        // Create a Dog object
        Dog myDog = new Dog("Tommy");

        // Call methods from Animal class
        myDog.makeNoise();
        myDog.sleep();
        myDog.eat();

        // Call methods from Dog class
        myDog.fetch();
        myDog.run();
        myDog.bite();

        // Create an Animal object from Dog class
        Animal myAnimal = new Animal("Lion");
        myAnimal.makeNoise();
        myAnimal.sleep();
        myAnimal.eat();
    }
}
