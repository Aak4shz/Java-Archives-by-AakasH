/*  The Challenge:

    Create an interface Vehicle with:

        Abstract method: void startEngine().

        Default method: void honk(). The body should print "Beep Beep!".

    Create an interface Electric with:

        Abstract method: void chargeBattery().

    Create a class TeslaModel3 that implements both Vehicle and Electric.

    Override the honk() method in TeslaModel3 to print a custom sound (e.g., "Silent electric hum...").

Goal: Understand how a class can take on multiple roles (Multiple Inheritance of Type) and how to use/override default methods.
 */

// * Vehicle Interface
interface Vehicle {
    // Abstract Method
    void startEngine();

    // Default Method
    default void honk() {
        System.out.println("Beep Beep!");
    }
}

// * Electric Interface
interface Electric {
    // Abstract Method
    void chargeBattery();
}

// * Tesla Model Class - Implements both Vehicle and Electric Interfaces
class TeslaModel implements Vehicle, Electric {

    private int batteryLevel;

    public TeslaModel() {
        this.batteryLevel = 100;
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla Model : Electric engine started silently...");
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = 100;
        System.out.println("Tesla Model : Battery Charging Level at " + batteryLevel + "%");

    }

    @Override
    public void honk() {
        System.out.println("Tesla Model : Silent electric hum...");
    }

    public void displayInfo() {
        System.out.println("Battery Level : " + batteryLevel + "%");
    }

}

// Regular Car for Comparison (Uses default honk)

class RegularCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Regular Car : Engine Started With roar : Vroom Vroom...");
    }

    @Override
    public void honk() {
        System.out.println("Regular Car : Honk Honk and Peep Peep !");
    }
}

public class Ch_Abstraction_Interface_06 {
    public static void main(String[] args) {

        System.out.println("\n======= Multiple Interface Implementation ========\n");
        TeslaModel tesla = new TeslaModel();
        tesla.displayInfo();
        tesla.startEngine();
        tesla.chargeBattery();
        tesla.honk();
        System.out.println();

        System.out.println("========Regular car =======\n");
        RegularCar regular = new RegularCar();
        regular.startEngine();
        regular.honk();
        System.out.println();
    }
}
