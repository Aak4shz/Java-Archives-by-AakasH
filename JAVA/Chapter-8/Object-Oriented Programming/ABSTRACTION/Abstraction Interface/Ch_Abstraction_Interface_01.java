
// ============Interface==================
interface Vehicle {
    int MAX_SPEED = 280;

    void start();

    void stop();

    void changeGear(int gear);

    void carryPassenger(int passenger);

    default void displayInfo() {
        System.out.println("Max Speed : " + MAX_SPEED + " km/h");
    }

}

class Bus implements Vehicle {

    private String name;
    private int year;
    private String type;
    private String color;
    private double price;
    private int passenger;

    // Constructors
    public Bus(String name, int year, String type, String color, double price, int passenger){
        this.name = name;
        this.year = year;
        this.type = type;
        this.color = color;
        this.price = price;
        this.passenger = passenger;
    }

    public void vehicleName(String name) {
        this.name = name;
        System.out.println("Model Name : " + name);
    }

    public void vehicleLaunchYear(int year) {
        this.year = year;
        System.out.println("Launch Year : " + year);
    }

    public void vehicleType(String type) {
        this.type = type;
        System.out.println("Type of Vehicle : " + type);
    }

    public void vehicleColor(String color) {
        this.color = color;
        System.out.println("Color of Vehicle : " + color);
    }

    public void vehiclePrice(double price) {
        this.price = price;
        System.out.println("Vehicle Price : " + price);
    }

    public void vehiclePassenger(int passenger) {
        this.passenger = passenger;
        System.out.println("Vehicle Total Passenger : " + passenger);
    }

    @Override
    public void start() {
        System.out.println("Vehicle is start. ");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stop. ");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Gear Number : " + gear);
    }


    @Override
    public void carryPassenger(int passenger) {
        System.out.println("Passenger Number :" + passenger);
    }

    public void modelName(String model) {
        System.out.println("Model Name : " + model);
    }
}


class MotorBike implements vehicle {

    private String name;
    private int year;
    private String type;
    private String color;
    private double price;
    private int passenger;

    // Constructors
    public MotorBike(String name, int year, String type, String color, double price, int passenger){
        this.name = name;
        this.year = year;
        this.type = type;
        this.color = color;
        this.price = price;
        this.passenger = passenger;

    }


    public void vehicleName(String name) {
        this.name = name;
        System.out.println(" Model Name " + name);
    }

    public void vehicleLaunchYear(int year) {
        this.year = year;
        System.out.println("Launch Year : " + year);
    }

    public void vehicleType(String type) {
        this.type = type;
        System.out.println("Type of Vehicle : " + type);
    }

    public void vehicleColor(String color) {
        this.color = color;
        System.out.println("Color of Vehicle : " + color);
    }

    public void vehiclePrice(double price) {
        this.price = price;
        System.out.println("Vehicle Price : " + price);
    }

    public void vehiclePassenger(int passenger) {
        this.passenger = passenger;
        System.out.println("Total Passenger on Vehicle : " + passenger);
    }

    @Override
    public void start() {
        System.out.println("MotorBike is start. ");
    }

    @Override
    public void stop() {
        System.out.println("MotorBIke is stop. ");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Gear Number : " + gear);
    }

    @Override
    public void carryPassenger(int passenger) {
        this.passenger = passenger;
        System.out.println("Passenger Number :" + passenger);
    }
}

public class Ch_Abstraction_Interface_01 {
    public static void main(String[] args) {
        vehicle bus = new Bus("Volvo", 2020, "Passenger Carrying", "White and Blue", 2140000.25000, 112);
        vehicle bike = new MotorBike("Yamaha", 2022, "Sports", "Red", 150000.00, 2);

        System.out.println("========== BUS ==========");

        bus.start();
        bus.displayInfo();
        bus.changeGear(3);
        bus.carryPassenger(48);
        bus.stop();

        System.out.println("\n========== MOTOR BIKE ==========");
        bike.start();
        bike.displayInfo();
        bike.changeGear(2);
        bike.carryPassenger(2);
        bike.stop();

      /*   System.out.println("\n========== BUS DETAILS ==========");
        Bus buss = new Bus();
        buss.vehicleName("Volvo");
        buss.vehicleColor("White and Blue");
        buss.vehicleLaunchYear(2020);
        buss.modelName("Volvo XR100 Plus");
        buss.vehicleType("Passenger Carrying");
        buss.vehiclePrice(2140000.25000);
        buss.vehiclePassenger(112); */
    }
}
