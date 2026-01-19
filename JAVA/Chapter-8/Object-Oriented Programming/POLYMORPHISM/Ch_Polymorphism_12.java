/* Question 8: E-Commerce Discount System

Create a discount system for an e-commerce platform:

Product (parent)
├── Electronics - 10% discount
├── Clothing - 20% discount + extra 5% if price > 1000
├── Groceries - 5% discount + buy 2 get 1 free logic
└── Books - 15% discount

Each should have:

    Constructor with name, price, quantity
    calculateDiscount() method
    getFinalPrice() method
    displayBill() method
Implement polymorphism to handle different product types seamlessly.
 */

class Product {
    String name;
    double price;
    int quantity;
    double discount;
    double finalPrice;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void calculateDiscount() {
        discount = 0;
        finalPrice = price * quantity;
    }

    double getFinalPrice() {
        return finalPrice;
    }

    void displayBill() {
        System.out.println("Product name: " + name);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Discount : " + discount);
        System.out.println("Final Price : " + finalPrice);
        System.out.println("-----------------------------------");
    }

}

class Electronics extends Product {

    Electronics(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    void calculateDiscount() {
        discount = (price * quantity) * 0.10;
        finalPrice = (price * quantity) - discount;
    }
}

class Clothing extends Product {
    Clothing(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    void calculateDiscount() {
        double percentage = 0.20;
        if (price > 1000) {
            percentage += 0.05;
        }
        discount = (price * quantity) * percentage;
        finalPrice = (price * quantity) - discount;
    }
}

class Groceries extends Product {
    Groceries(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    void calculateDiscount() {
        // Buy 2 Get 1 Free logic: Pay for (quantity - quantity/3)
        int paidQuantity = quantity - (quantity / 3);
        double subTotal = paidQuantity * price;
        double extraDiscount = subTotal * 0.05;

        finalPrice = subTotal - extraDiscount;
        discount = (price * quantity) - finalPrice;
    }
}

class Books extends Product {
    Books(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    void calculateDiscount() {
        discount = (price * quantity) * 0.15;
        finalPrice = (price * quantity) - discount;
    }
}

public class Ch_Polymorphism_12 {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics("Laptop", 60000, 1),
                new Clothing("T-Shirt", 800, 2),
                new Clothing("Suit", 5000, 1),
                new Groceries("Rice", 50, 5),
                new Books("Java Guide", 450, 3)
        };

        for (Product p : products) {
            p.calculateDiscount();
            p.displayBill();
        }
    }
}
