// Create a class Employee with methods work() and getSalary(). 
// Make a subclass HRManager that overrides work() and adds a new method addEmployee().

class Employee {
    public void work() {
        System.out.println("Employee is Working.");
    }

    public int getSalary() {
        return 10000;
    }

    public void leave() {
        System.out.println("Employee is Leaving.");
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is Working.");
    }

    @Override
    public int getSalary() {
        return 80000;
    }

    public void addEmployee() {
        System.out.println("HR Manager is Adding Employee.");
    }

}

public class QuestionNo_4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println("Salary : " + emp.getSalary() + " Rupees.");
        emp.leave();
        System.out.println();

        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("Salary : " + hr.getSalary() + " Rupees.");
        System.out.println();

    }
}
