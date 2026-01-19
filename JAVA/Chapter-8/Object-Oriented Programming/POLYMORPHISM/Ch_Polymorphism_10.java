/* Question 6: Payment System

Create a payment processing system:

text

Payment (parent)
├── CreditCardPayment
├── UPIPayment
└── CashPayment

Each should have:

    processPayment(double amount) method
    getCharges(double amount) method (different for each)
        CreditCard: 2% charge
        UPI: 0% charge
        Cash: 0% charge but prints "No change available for large amounts"
Implement polymorphism to handle different payment methods seamlessly. 
 */

class Payment {
  void processPayment(double amount) {
    System.out.println("Processing payment of : " + amount);
  }

  double getCharges(double amount) {
    return 0;
  }
}

class CreditCardPayment extends Payment {

  @Override
  void processPayment(double amount) {
    System.out.println("Processing Credit Card Payment of : " + amount);
  }

  @Override
  double getCharges(double amount) {
    return amount * 0.02;
  }

}

class UPIPayment extends Payment {

  @Override
  void processPayment(double amount) {
    System.out.println("Processing UPI Payment of : " + amount);
  }

  @Override
  double getCharges(double amount) {
    return 0;
  }

}

class CashPayment extends Payment {

  @Override
  void processPayment(double amount) {
    System.out.println("Processing Cash Payment of : " + amount);
  }

  @Override
  double getCharges(double amount) {
    if (amount > 1000) {
      System.out.println("No change available for large amounts.");
    }
    return 0;
  }

}

class PaymentProcessor {
  void processPayment(Payment payment, double amount) {
    payment.processPayment(amount);
    double charges = payment.getCharges(amount);
    System.out.println("Charges applied : " + charges);
    System.out.println("Total amount deducted : " + (amount + charges));
  }
}

public class Ch_Polymorphism_10 {
  public static void main(String[] args) {

    PaymentProcessor processor = new PaymentProcessor();

    Payment creditCardPayment = new CreditCardPayment();
    processor.processPayment(creditCardPayment, 82405.45);
    System.out.println("-----------------------------------");

    Payment upiPayment = new UPIPayment();
    processor.processPayment(upiPayment, 1500.50);
    System.out.println("-----------------------------------");

    Payment cashPayment = new CashPayment();
    processor.processPayment(cashPayment, 2000.61);
    System.out.println("-----------------------------------");

  }
}
