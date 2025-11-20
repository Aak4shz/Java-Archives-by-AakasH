/*
 * =============================================================
 *              STANDARD FLOWCHART OOP EXAMPLE (Java)
 * =============================================================
 * This program demonstrates:
 * 1. Encapsulation (private variables + getters/setters)
 * 2. Constructor initialization of objects
 * 3. Object creation using clean code conventions
 * 4. Behavior methods inside class
 * -------------------------------------------------------------
 * Class Name      : Employee
 * Real World Use  : Employee Management System
 * =============================================================
 */

class Employee {

    // 1. Private fields => (Protect Data)

    private int id;
    private String name;
    private Double salary;
    private String address;

    // 2. Constructor (Initialize Objects)
    public Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        // ("this") keyword refers to the current object instance
    }

    // 3. Getter and Setter Methods (Controlled access to private variables)

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    // 4. Behavior Method (Display Employee Details)
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address);
    }
}

public class Ch_OOps_02 { // Main Class
    public static void main(String[] args) { // Execution or Testing

        // 5. Creating Objects (Employee in System)

        Employee emp1 = new Employee(1, "Aakash", 45000, "Ranchi Bundu");
        Employee emp2 = new Employee(2, "Sachin", 54000, "Delhi NCR 11");
        Employee emp3 = new Employee(3, "Monaj", 60000, "Bokaro Steel City");

        // 6. Calling Behavior Method

        System.out.println("======Employee 1 Details======");
        emp1.displayDetails();

        System.out.println("======Employee 2 Details======");
        emp2.displayDetails();

        System.out.println("======Employee 3 Details======");
        emp3.displayDetails();

        // Modifying Data Using Setter (salary update)
        emp1.setSalary(80000);
        System.out.println("\nAfter Salary Update : ");
        emp1.displayDetails();
    }

}
