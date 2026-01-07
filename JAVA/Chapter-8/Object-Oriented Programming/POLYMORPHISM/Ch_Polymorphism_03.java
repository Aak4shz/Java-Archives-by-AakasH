// * The Smart Printer(Method Overloading) -> Compile time Polymorphism (Static Binding) 
/* 
 * The Task: Create a class called Printer. You need to provide the capability to print different types of data using the same method name printData.

 *  Write a method printData that takes a String and prints: "Printing document: [value]"

 *   Write a method printData that takes an int and prints: "Printing page number: [value]"

 *   Write a method printData that takes a String and an int (copies) and prints: "Printing [copies] copies of: [value]"

 *   Main Class: Create a main method to instantiate Printer and call all three methods.
 */
class Printer {
    // Method to print a string (document)
    public void printData(String document) {
        System.out.println("Printing Document : " + document);
    }

    // Method to print an integer (page number)
    public void printData(int pageNumber) {
        System.out.println("Printing page number : " + pageNumber);
    }

    // Method to print a string (document) with number of copies
    public void printData(String document, int copies) {
        System.out.println("Printing " + copies + " copies of : " + document);
    }

}

public class Ch_Polymorphism_03 {
    public static void main(String[] args) {
        // Create an instance of Printer
        Printer myPrinter = new Printer();
        // call the method to print a document
        myPrinter.printData("JAVA POLYMORPHISM");
        // call the method to print a page number
        myPrinter.printData(112);
        // call the method to print multiple copies of a document
        myPrinter.printData("JAVA POLYMORPHISM", 3);

    }
}
