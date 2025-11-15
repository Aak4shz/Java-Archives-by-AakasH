// Write a program with varargs method printNumbers(int... nums) to print all numbers passed.
public class Question_14 {
    void printNumbers(int... nums) {
        for (int num : nums) {
            System.out.println("Number is: " + num + " ");
        }
    }

    public static void main(String[] args) {
        Question_14 obj = new Question_14();
        obj.printNumbers(1);
        obj.printNumbers(10);
        obj.printNumbers(11);
        obj.printNumbers(100);
        obj.printNumbers(101);
        obj.printNumbers(110);
        obj.printNumbers(111);
        obj.printNumbers(1000);
        obj.printNumbers(1001);
        obj.printNumbers(1010);
        obj.printNumbers(1011);
        obj.printNumbers(10000);
        
    }
}
