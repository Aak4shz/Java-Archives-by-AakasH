/* Question 2: Basic Overriding - Vehicle
Create a parent class Vehicle and child classes Car, Bike, Bus
Each should override start() method with their own message. 
 */

class Vehicle {
    void start() {
        System.out.println("Vehicle Started.");
    }

    void stop() {
        System.out.println("Vehicle Stopped.");
    }
}

class Car extends Vehicle {
    String name = "BMW M3";

    void name() {
        System.out.println("This Vehicle is : " + name);
    }

    @Override
    void start() {
        System.out.println(name + " is stared with a key. ");
    }

    @Override
    void stop() {
        System.out.println(name + " is stopped with brake.");
    }
}

class Bike extends Vehicle {
    String name = "RE Continental GT 650";

    void name() {
        System.out.println("This vehicle is : " + name);
    }

    @Override
    void start() {
        System.out.println(name + " is stared with a kick.");
    }

    @Override
    void stop() {
        System.out.println(name + " os stopped with a brake.");
    }
}

class Bus extends Vehicle {
    String name = "Volvo Star Bus";

    void name() {
        System.out.println("This vehicle is : " + name);
    }

    @Override
    void start() {
        System.out.println(name + " is started with a button.");
    }

    @Override
    void stop() {
        System.out.println(name + " is stopped with a brake.");
    }
}

public class Ch_Polymorphism_06 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();

        System.out.println("====> Car <====");
        car.name();
        car.start();
        car.stop();
        System.out.println();

        System.out.println("====> Bike <====");
        bike.name();
        bike.start();
        bike.stop();
        System.out.println();

        System.out.println("====> Bus <====");
        bus.name();
        bus.start();
        bus.stop();
        System.out.println();
    }
}
