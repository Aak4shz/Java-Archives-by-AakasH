/* Question 4: Bank Account Interest

Create a banking system with different account types:

Account (parent)
├── SavingsAccount - interest rate 4%
├── FixedDeposit - interest rate 8%
└── CurrentAccount - interest rate 0%

Each class should have:

    double balance (constructor parameter)
    calculateInterest() method
    displayInfo() method
 
 */

// Parent  Class
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }

    void displayInfo() {
        System.out.println("Account Balance : " + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }

    @Override
    void displayInfo() {
        System.out.println("Account Type : Savings Account");
        System.out.println("Account Balance : " + balance);
        System.out.println("Interest Rate : 4%");
        System.out.println("Interest Amount : " + calculateInterest());
        System.out.println("Total Amount after Interest : " + (balance + calculateInterest()));
    }
}

// Child Class 1

class FixedDeposit extends Account {

    FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.08;
    }

    @Override
    void displayInfo() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Account Balance : " + balance);
        System.out.println("Interest Rate : 8%");
        System.out.println("Interest Amount : " + calculateInterest());
        System.out.println("Total Amount after Interest : " + (balance + calculateInterest()));
    }
}

// Child Class 2

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return 0;
    }

    @Override
    void displayInfo() {
        System.out.println("Account Type : Current Account");
        System.out.println("Account Balance : " + balance);
        System.out.println("Interest Rate : 0%");
        System.out.println("Interest Amount : " + calculateInterest());
        System.out.println("Total Amount after Interest : " + (balance + calculateInterest()));
    }
}

public class Ch_Polymorphism_08 {
    public static void main(String[] args) {

        // Using Polymorphism with an Array of Accounts

        Account[] accounts = {
                new SavingsAccount(100000.15),
                new FixedDeposit(21855.24),
                new CurrentAccount(52410.36)
        };

        for (Account account : accounts) {
            account.displayInfo();
            System.out.println("-----------------------");
        }
    }
}
