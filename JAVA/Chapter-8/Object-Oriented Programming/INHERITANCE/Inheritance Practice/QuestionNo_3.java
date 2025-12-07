// * Implement single inheritance: create a parent class Vehicle and a child class Car 
// * that inherits Vehicle's properties and methods.
// * The Car class overrides Vehicle methods to provide car-specific implementations.

class Vehicle {
    int numberOfWheels = 4;
    String fuelType = "Petrol";
    String category = "Luxury and Sport Car";


    public void start() {
        System.out.println("Vehicle Started.");
    }

    public void stop() {
        System.out.println("Vehicle Stopped.");
    }

    public void wheel() {
        System.out.println("Vehicle has " + numberOfWheels + " wheels.");
    }
}

class Car extends Vehicle {
    String name = "Aston Martin DB11";
    int year = 2010;
    String color = "Racing Green";

    public void displayInfo() {
        System.out.println("Model Name : " + name);
        System.out.println("Launch Year : " + year);
        System.out.println("Colour : " + color);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Category : " + category);
        System.out.println();
    }

    @Override
    public void start() {
        System.out.println("Car Started.");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped.");
    }

    @Override
    public void wheel() {
        System.out.println("Car has " + numberOfWheels + " wheels.");
    }
}

public class QuestionNo_3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("===Vehicle===");
        vehicle.start();
        vehicle.stop();
        vehicle.wheel();
        System.out.println();

        Car car = new Car();
        System.out.println("===Car===");
        car.start();
        car.stop();
        car.wheel();
        System.out.println();
        car.displayInfo();
    }
}
