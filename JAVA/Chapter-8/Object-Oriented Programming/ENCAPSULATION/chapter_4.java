/* 
* Create a class Car
* Private fields:
* speed
* gear

* Rules:
* Speed cannot go below 0.
* Gear must be between 1–6.

* Create methods:
* accelerate(int x)
* applyBrake(int x)
* changeGear(int g)
 */
class Car {
    private int speed;
    private int gear;

    public void accelerate(int x) {
        if (x > 0) {
            speed += x;
        }
    }

    public void applyBrake(int x) {
        if (x > 0) {
            speed -= x;
            if (speed < 0) {
                speed = 0;
            }
        }
    }

    public void changeGear(int g) {
        if (g >= 1 && g <= 6) {
            gear = g;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public Car() {
        speed = 0;
        gear = 1;
    }

    public Car(int s, int g) {
        if (s < 0)
            s = 0;
        if (g < 1 || g > 6)
            g = 1;
        speed = s;
        gear = g;
    }

}

public class chapter_4 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("Gear : " + c1.getGear());
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.changeGear(2);
        System.out.println("Gear : " + c1.getGear());
        c1.accelerate(30);
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.changeGear(3);
        System.out.println("Gear : " + c1.getGear());
        c1.accelerate(41);
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.applyBrake(23);
        System.out.println("Brake Applied...");
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.changeGear(4);
        System.out.println("Gear : " + c1.getGear());
        c1.accelerate(54);
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.changeGear(5);
        System.out.println("Gear : " + c1.getGear());
        c1.accelerate(62);
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.changeGear(6);
        System.out.println("Gear : " + c1.getGear());
        c1.accelerate(55);
        System.out.println("Speed : " + c1.getSpeed());
        System.out.println("---------------------------------");

        c1.applyBrake(60);
        System.out.println("Brake Applied...");
        System.out.println("Speed : " + c1.getSpeed());
    }
}
