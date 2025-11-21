// Question 1 :Create a class Employee with following properties and methods:
// Properties: Name, Salary , Age
// Methods: getName(), getSalary(), setName() getAge(), setAge(), setSalary(), printDetails()

class Employee {
    private String name;
    private int salary;
    private int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // print method
    public void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Age : " + age);
        System.out.println();
    }

}

public class Prac_Ques_01 {
    public static void main(String[] args) {
        Employee emp = new Employee("Aakash Munda", 50000, 26);
        emp.printDetails();

        Employee emp1 = new Employee("Badal", 60000, 27);
        emp1.printDetails();

        Employee emp2 = new Employee("Sachin ChutMarike", 55000, 30);
        emp2.printDetails();

        Employee emp3 = new Employee("Monaj Oraon", 45500, 25);
        emp3.printDetails();

        Employee emp4 = new Employee("Ravi Charan", 45000, 24);
        emp4.printDetails();

        Employee emp5 = new Employee("Rahul", 50000, 31);
        emp5.printDetails();

        System.out.println("================After Five Years Later==================\n");
        emp.setSalary(60000);
        emp.setAge(27);
        emp.printDetails();

        emp1.setSalary(70000);
        emp1.setAge(28);
        emp1.printDetails();

        emp2.setSalary(55000);
        emp2.setAge(31);
        emp2.printDetails();

        emp3.setAge(26);
        emp3.setSalary(50000);
        emp3.printDetails();

        emp4.setAge(25);
        emp4.setSalary(50000);
        emp4.printDetails();

        emp5.setAge(32);
        emp5.setSalary(60000);
        emp5.printDetails();
    }
}
