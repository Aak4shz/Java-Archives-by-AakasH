// Abstraction - Abstract Class

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike start with self/start button.");
    }
}

public class Abstraction_1 {
    public static void main(String[] args) {
        // vehicle v = new Vehicle();  // Error , can't create object of abstract class

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
