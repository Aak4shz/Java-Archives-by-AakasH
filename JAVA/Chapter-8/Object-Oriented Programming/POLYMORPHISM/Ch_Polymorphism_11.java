/* Question 7: Notification System

Create a notification system:

Notification (parent)
├── EmailNotification
├── SMSNotification
└── PushNotification

Each should override:

    send(String message) - sends notification
    getDeliveryTime() - returns delivery time in seconds
Implement polymorphism to handle different notification types seamlessly. 
 */

class Notification {
    void sendMessage(String message) {
        System.out.println("Sending notification : " + message);
    }

    int getDeliveryTime() {
        return 0;
    }

    void seenMessage() {
        System.out.println("Seen & Read notification. ");
    }

    int getSeenTime() {
        return 0;
    }
}

class EmailNotification extends Notification {
    @Override
    void sendMessage(String message) {
        System.out.println("Sending Email Notification : " + message);
    }

    @Override
    int getDeliveryTime() {
        return 5;
    }

    @Override
    void seenMessage() {
        System.out.println("Seen & Read EMail notification.");
    }

    @Override
    int getSeenTime() {
        return 10;
    }

}

class SMSNotification extends Notification {
    @Override
    void sendMessage(String message) {
        System.out.println("Sending SMS Notification : " + message);
    }

    @Override
    int getDeliveryTime() {
        return 6;
    }

    @Override
    void seenMessage() {
        System.out.println("Seen & Read SMS notification.");
    }

    @Override
    int getSeenTime() {
        return 12;
    }

}

class PushNotification extends Notification {
    @Override
    void sendMessage(String message) {
        System.out.println("Sending Push Notification : " + message);
    }

    @Override
    int getDeliveryTime() {
        return 7;
    }

    @Override
    void seenMessage() {
        System.out.println("Seen & Read Push notification.");
    }

    @Override
    int getSeenTime() {
        return 10;
    }

}

public class Ch_Polymorphism_11 {
    public static void main(String[] args) {
        processNotification(new EmailNotification(), "Hallo! Hallo !");
        processNotification(new SMSNotification(), "Hello ! My Friend , Did you forget me ?");
        processNotification(new PushNotification(), "Kyu re Madarchod ! Yenha Akele Akele Mutthi hila rha hai.");
    }

    // Helper method to demonstrate Polymorphism
    static void processNotification(Notification nf, String message) {
        System.out.println();
        nf.sendMessage(message);
        System.out.println("Delivery Time : " + nf.getDeliveryTime() + " seconds");
        nf.seenMessage();
        System.out.println("Seen Time : " + nf.getSeenTime() + " seconds");
        System.out.println("-----------------------------------");
    }
}
