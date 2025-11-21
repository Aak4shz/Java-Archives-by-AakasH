/* ====================================================================================================================
 *  Practice Program for Object-Oriented Programming (OOPs)
   ====================================================================================================================
*/

class Students {
    private String name;
    private int rollNo;
    private String stdLevel;
    private char sec;
    private int age;
    private String address;
    private int scholarship;

    // Constructor to initialize the student object.
    Students(String n, int rN, String sL, char s, int a, String add, int sc) {
        this.name = n;
        this.rollNo = rN;
        this.stdLevel = sL;
        this.sec = s;
        this.age = a;
        this.address = add;
        this.scholarship = sc;
    }
    // Method to print the details of the student.

    public void printDetails(boolean showSection) {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollNo);
        System.out.println("Standard level : " + stdLevel);
        // Agar showSection true hai to section print karo
        if (showSection) {
            System.out.println("Section : " + sec);
        }

        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }
    // Method to get the scholarships of" + student.names".

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStdLevel() {
        return stdLevel;
    }

    public void setStdLevel(String stdLevel) {
        this.stdLevel = stdLevel;
    }

    public char getSec() {
        return sec;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
// main class to this program.

public class Ch_OOPs_03 {
    public static void main(String[] args) {

        // Creating objects of Students class and initializing them using the
        // constructor.

        Students student = new Students("Mr.Aakash Munda", 1, "12", 'A', 19, "Bundu Ranchi", 20000);
        Students student1 = new Students("Mr.Abhishek Ekka", 2, "12", 'A', 17, "Gumla Bishunpur", 17000);
        Students student2 = new Students("Mr.Raju Kisku", 3, "12", 'A', 18, "chini Bokaro", 14000);
        Students student3 = new Students("Mr.Ram Gopal Verma", 4, "12", 'A', 20, "Mumbai", 20000);
        Students student4 = new Students("Mr.Badal Kumar", 5, "12", 'A', 19, "Ranchi Jharkhand", 18000);
        Students student5 = new Students("Mr.Suraj Kumar", 6, "12", 'B', 21, "Bihar", 16000);
        Students student6 = new Students("Mr.Sachin Chutmarike", 7, "12", 'B', 22, "Ranchi Jharkhand", 19000);
        Students student7 = new Students("Mr.Monaj Oraon", 8, "12", 'B', 20, "Ranchi Jharkhand", 15000);

        // Printing the details of each student and their .

        student.printDetails(true);
        int schoolerShip = student.getScholarship();
        System.out.println("And Scholars-Ship of " + student.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student1.printDetails(true);
        schoolerShip = student1.getScholarship();
        System.out.println("And Scholars-Ship of " + student1.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student2.printDetails(true);
        schoolerShip = student2.getScholarship();
        System.out.println("And Scholars-Ship of " + student2.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student3.printDetails(true);
        schoolerShip = student3.getScholarship();
        System.out.println("And Scholars-Ship of " + student3.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student4.printDetails(true);
        schoolerShip = student4.getScholarship();
        System.out.println("And Scholars-Ship of " + student4.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student5.printDetails(true);
        schoolerShip = student5.getScholarship();
        System.out.println("And Scholars-Ship of " + student5.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student6.printDetails(true);
        schoolerShip = student6.getScholarship();
        System.out.println("And Scholars-Ship of " + student6.getName() + " is " + schoolerShip + ".\n");
        System.out.println("-----------------------------------\n");

        student7.printDetails(true);
        schoolerShip = student7.getScholarship();
        System.out.println("And Scholars-Ship of " + student7.getName() + " is " + schoolerShip + ".\n");
        // Using a loop to print the details of each student and their .
        /*
         * 
         * Students[] students = {student, student1, student2, student3, student4,
         * student5, student6, student7};
         * for (Students studentObj : students) {
         * studentObj.printDetails();
         * int schoolerShip = studentObj.getScholarship();
         * System.out.println("And Scholars-Ship of " + studentObj.name + " is " +
         * schoolerShip + ".\n");
         * }
         */

        // After Next Year their details are changes or updates...

        System.out.println("======================After Next Year========================\n");
        student.setScholarship(25000);
        student.setRollNo(45);
        student.setAge(20);
        student.setStdLevel("UG - 1st Year");
        student.printDetails(false);
        System.out.println("And Scholarship of " + student.getName() +
                " is updated to " + student.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student1.setScholarship(20000);
        student1.setRollNo(25);
        student1.setAge(18);
        student1.setStdLevel("UG-1st Year");
        student1.printDetails(false);
        System.out.println("And Scholarship of " + student1.getName() +
                " is updated to " + student1.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student2.setScholarship(20000);
        student2.setRollNo(11);
        student3.setAge(19);
        student2.setStdLevel("UG-1st Year");
        student2.printDetails(false);
        System.out.println("And Scholarship of " + student2.getName() +
                " is updated to " + student2.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student3.setScholarship(30000);
        student3.setRollNo(41);
        student3.setAge(21);
        student3.setStdLevel("UG-1st Year");
        student3.printDetails(false);
        System.out.println("And Scholarship of " + student3.getName() +
                " is updated to " + student3.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student4.setScholarship(27000);
        student4.setAge(20);
        student4.setRollNo(33);
        student4.setStdLevel("UG-1st Year");
        student4.printDetails(false);
        System.out.println("And Scholarship of " + student4.getName() +
                " is updated to " + student4.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student5.setScholarship(25000);
        student5.setAge(22);
        student5.setRollNo(20);
        student5.setStdLevel("UG-1st year");
        student5.printDetails(false);
        System.out.println("And Scholarship of " + student5.getName() +
                " is updated to " + student5.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student6.setScholarship(33000);
        student6.setRollNo(69);
        student6.setAge(23);
        student6.setStdLevel("UG-1st Year");
        student6.printDetails(false);
        System.out.println("And Scholarship of " + student6.getName() +
                " is updated to " + student6.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

        student7.setScholarship(22000);
        student7.setRollNo(101);
        student7.setAge(21);
        student7.setStdLevel("UG-1st Year");
        student7.printDetails(false);
        System.out.println("And Scholarship of " + student7.getName() +
                " is updated to " + student7.getScholarship() + ".\n");
        System.out.println("-----------------------------------\n");

    }

}
