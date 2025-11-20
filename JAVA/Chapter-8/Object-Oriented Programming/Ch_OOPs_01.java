/* ===============================Object-Oriented Programming in Java==============================
 * How Object-Oriented Programming works in a custom class
 * OOP is a programming paradigm that uses objects and classes to organize a program
 * In this program, we have a custom class called 'myEmployee' which has three properties: id, salary and name
 * The class also has a method called 'printDetails()' which prints out the values of the properties
 * This is an example of encapsulation, which is a key concept in OOP, as it allows us to hide the implementation
 *  details of an object from the outside world and only expose the necessary information through public methods.
 */

class myEmployee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.print(" My id is " + id);
        System.out.print(" and name is " + name);

    }

    public int getSalary() {
        return salary;

    }
}

public class Ch_OOPs_01 {
    public static void main(String[] args) {
        System.out.println("---------------This is OOPs in java.-------------");

        myEmployee Aakash = new myEmployee();
        myEmployee Badal = new myEmployee();
        myEmployee Sachin = new myEmployee();
        myEmployee Monaj = new myEmployee();

        // Setting properties for Objects..

        Aakash.id = 1;
        Aakash.name = "Mr Aakash Munda";
        Aakash.salary = 50000;

        Badal.id = 2;
        Badal.name = "Mr Badal Munda";
        Badal.salary = 60000;

        Sachin.id = 3;
        Sachin.name = "Mr Sachin ChutMarike";
        Sachin.salary = 70000;

        Monaj.id = 4;
        Monaj.name = "Mr Monaj Oraon";
        Monaj.salary = 80000;

        Aakash.printDetails();
        int salary = Aakash.getSalary();
        System.out.println(", Salary : " + salary);
        System.out.println("--------------------------------");

        Badal.printDetails();
        int salary2 = Badal.getSalary();
        System.out.println(", Salary : " + salary2);
        System.out.println("--------------------------------");

        Sachin.printDetails();
        int salary3 = Sachin.getSalary();
        System.out.println(", Salary : " + salary3);
        System.out.println("--------------------------------");

        Monaj.printDetails();
        int salary4 = Monaj.getSalary();
        System.out.println(", Salary : " + salary4);
    }

}
/*  Summary:
This program shows how OOP's basic flowchart works:
Create class
Add variables
Add methods
Create objects
Set data
Call methods
Print result
*/