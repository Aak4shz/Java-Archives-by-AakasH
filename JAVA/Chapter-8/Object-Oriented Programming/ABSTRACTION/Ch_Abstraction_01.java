// Abstraction - Abstract Class
// Abstract base class that defines common properties and behaviors of all vehicles
abstract class Vehicle {

    // Common details shared by all vehicles
    String name;
    int year;
    String color;
    String fuelType;
    String category;
    int wheel;
    int engineCC;
    int speed;

    // Actions that every vehicle must be able to do its own way
    abstract void start();

    abstract void speed();

    abstract void stop();

    abstract void wheel();

    abstract void engine();

    // Constructor to set basic details of the vehicle
    Vehicle(String name, int year, String color, String fuelType, String category, int wheel, int engineCC, int speed) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.fuelType = fuelType;
        this.category = category;
        this.wheel = wheel;
        this.engineCC = engineCC;
        this.speed = speed;
    }

    // Prints basic information that is common for all vehicles
    public void basicInfo() {
        System.out.println("Model Name : " + name);
        System.out.println("Launch Year : " + year);
        System.out.println("Colour : " + color);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Category : " + category);
    }
}

// Car class is a subclass of Vehicle
class Car extends Vehicle {
    Car(String name, int year, String color, String fuelType, String category, int wheel, int engineCC, int speed) {
        super(name, year, color, fuelType, category, wheel, engineCC, speed);
    }

    @Override
    void start() {
        System.out.println(name + " is started.");
    }

    @Override
    void speed() {
        System.out.println(name + " is running at " + speed + " km/h");
    }

    @Override
    void stop() {
        System.out.println(name + " is stopped.");
    }

    @Override
    void wheel() {
        System.out.println(name + " has " + wheel + " wheels.");
    }

    @Override
    void engine() {
        System.out.println(name + " has an engine of " + engineCC + " cc.");
    }
}

// Bike class is an another subclass of Vehicle
class Bike extends Vehicle {
    Bike(String name, int year, String color, String fuelType, String category, int wheel, int engineCC, int speed) {
        super(name, year, color, fuelType, category, wheel, engineCC, speed);
    }

    @Override
    void start() {
        System.out.println(name + " is started.");
    }

    @Override
    void speed() {
        System.out.println(name + " is running at " + speed + " km/h.");
    }

    @Override
    void stop() {
        System.out.println(name + " is stopped.");
    }

    @Override
    void wheel() {
        System.out.println(name + " has " + wheel + " wheels.");
    }

    @Override
    void engine() {
        System.out.println(name + " has an engine of " + engineCC + " cc.");
    }
}

// Test class to run and check abstraction example
public class Ch_Abstraction_01 {
    public static void main(String[] args) {
        Vehicle car = new Car("Aston Martin DB11", 2016, "Racing Green", "Petrol", "Luxury and Sport Car", 4, 5000,
                345);
        car.basicInfo();
        car.start();
        car.speed();
        car.stop();
        car.wheel();
        car.engine();
        System.out.println();

        Vehicle bike = new Bike("BMW 1000 RR", 2019, "White & Blue", "Petrol", "Sport Bike", 2, 1099, 350);
        bike.basicInfo();
        bike.start();
        bike.speed();
        bike.stop();
        bike.wheel();
        bike.engine();
        System.out.println();
    }
}
