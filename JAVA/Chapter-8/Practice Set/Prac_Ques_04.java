// Problem 4: Create a class for a game with methods for hitting, running, firing, etc.
class PUBG {
    public void hit() {
        System.out.println("You are Hitting by a Enemy. ");
    }

    public void run() {
        System.out.println("You are Running away from Enemy.");
    }

    public void fire() {
        System.out.println("You are Firing on Enemy.");
    }

    public void heal() {
        System.out.println("You are Healing Yourself.");
    }

    public void reCall() {
        System.out.println("You are Recalling to your Base.");
    }
}

public class Prac_Ques_04 {
    public static void main(String[] args) {
        PUBG game = new PUBG();
        game.hit();
        game.run();
        game.fire();
        game.heal();
        game.reCall();
    }

}
