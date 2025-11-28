/*
 * Encapsulation:
 * Encapsulation is the process of wrapping code and data together into a single unit.
 * In Java, this is achieved by using classes.
 * It allows us to control the access to the data members and methods.
 *
 * 1. Create a class Person with private fields
 * name
 * age

 * Requirements:
 * Create getters and setters.
 * In main(), create an object, set values, and print them. */

// The 'Person' class encapsulates the data (name, age) and the methods (getters, setters) that operate on that data.
class Person {
    // Private fields: 'name' and 'age' are declared as private.
    // This means they can only be accessed directly from within the 'Person' class itself.
    // This is a core principle of encapsulation, preventing direct external modification of the object's state.
    private String name;
    private int age;

    // Public getter method for 'name'.
    // This method provides controlled read access to the 'name' field from outside the class.
    public String getName() {
        return name;
    }

    // Public setter method for 'name'.
    // This method provides controlled write access to the 'name' field from outside the class.
    // We could add validation logic here if needed (e.g., ensure name is not null or empty).
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for 'age'.
    // Provides controlled read access to the 'age' field.
    public int getAge() {
        return age;
    }

    // Public setter method for 'age'.
    // Provides controlled write access to the 'age' field.
    // We could add validation here (e.g., ensure age is positive).
    public void setAge(int age) {
        this.age = age;
    }
}

public class chapter_1 {
    public static void main(String[] args) {
        // Create an object of the Person class.
        Person person = new Person();
        person.setAge(45);
        person.setName("Aakash");
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
    }
}
