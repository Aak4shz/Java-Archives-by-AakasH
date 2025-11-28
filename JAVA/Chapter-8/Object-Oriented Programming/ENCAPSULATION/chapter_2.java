/* 
* Create a class BankAccount
* Private fields:
* accountNumber
* balance

* Tasks:
* Allow only deposit() and withdraw() public methods to update balance.
* Balance should never become negative.
* Print balance after each operation.
 */

class BankAccount {
    // Encapsulation: The class's private fields are hidden from other classes
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    // Encapsulation: Public getter and setter methods provide controlled access to the private fields.
    // Getter and Setter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance : " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance : " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
    }
}

public class chapter_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aakash Munda", "62000BKL357XX1", 1000.25);
        System.out.println("Account Holder Name : " + account.getAccountHolderName());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("--------------------------------------------------------");
        account.deposit(25000.86);
        System.out.println("After Deposit Total Amount : " + account.getBalance());
        System.out.println("--------------------------------------------------------");
        account.withdraw(3864.71);
        System.out.println("After Withdrawal. Total Amount : " + account.getBalance());
    }

}
