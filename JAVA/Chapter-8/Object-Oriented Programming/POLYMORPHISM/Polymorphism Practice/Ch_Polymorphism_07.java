/*  Question 3: Overriding - Employee Salary

 * Create classes for different employee types:

 *   Employee (parent) - getSalary() returns 30000
 *   Manager - getSalary() returns 50000
 *   Developer - getSalary() returns 45000
 *   Intern - getSalary() returns 15000

 */

class Employee {
    int salary = 30000;

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    char gradeLevel() {
        return 'A';
    }
}

class Manager extends Employee {
    Manager() {
        this.salary = 50000;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    char gradeLevel() {
        return 'S';
    }
}

class Developer extends Employee {
    Developer() {
        this.salary = 45000;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    char gradeLevel() {
        return 'C';
    }
}

class Intern extends Employee {
    Intern() {
        this.salary = 15000;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    char gradeLevel() {
        return 'D';
    }
}

public class Ch_Polymorphism_07 {
    public static void main(String[] args) {
        // Polymorphism: Array of Parent reference holding Child objects
        Employee[] employees = {
                new Employee(),
                new Manager(),
                new Developer(),
                new Intern()
        };

        System.out.println();

        for (Employee emp : employees) {
            String role = emp.getClass().getSimpleName(); // Gets the class name (e.g., "Manager")
            System.out.println(role + " Salary : " + emp.getSalary());
            System.out.println(role + " Grade Level : " + emp.gradeLevel());
            System.out.println();
        }
        // Update theirs salaries after one year

        employees[0].setSalary(50000);
        System.out.println("Employee's updated Salary after one year : " + employees[0].salary);
        System.out.println();

        employees[1].setSalary(75000);
        System.out.println("Manager's updated Salary after one year : " + employees[1].salary);
        System.out.println();

        employees[2].setSalary(55000);
        System.out.println("Developer's updated Salary after one year : " + employees[2].salary);
        System.out.println();

        employees[3].setSalary(20000);
        System.out.println("Intern's updated Salary after one year : " + employees[3].salary);
        System.out.println();
    }
}
