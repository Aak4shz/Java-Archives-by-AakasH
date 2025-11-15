/* 
* Create a class Bank with methods:
* deposit(int amount) → adds balance
* withdraw(int amount) → deducts balance (if enough)
* displayBalance() → prints current balance
* Use all methods in main().

*/
class Bank {
    int balance = 1000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance! Current Balance : " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance : " + balance);
    }
}

public class Question_16 {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.displayBalance();
        myBank.deposit(5000);
        System.out.println("\nAfter Deposit : " + " ");
        myBank.displayBalance();
        myBank.withdraw(2500);
        System.out.println("\nAfter Withdrawal : " + " ");
        myBank.displayBalance();
        myBank.withdraw(4000);
    }

}
