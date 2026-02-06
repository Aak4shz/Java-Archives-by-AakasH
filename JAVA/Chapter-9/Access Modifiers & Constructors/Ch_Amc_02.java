// 1. Access Modifiers & Constructors
    //! Type 1 -> Private Modifier

class MyEmployee {
    // Private variables: Cannot be accessed directly from outside this class
    private int id;
    private String name;

    // Constructor
    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int i) {
        this.id = i;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

public class Ch_Amc_02 {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee(1, "Aakash");

        // emp.id = 2; // Throws an error because id is private
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
    }
}
