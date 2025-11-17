// Write a java program a function to find the average of an set of numbers
// passed as an arguments.

public class Prac_Ques_06 {
    static double findAverage(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        double result = findAverage(50, 75, 25, 78, 67, 91, 73);
        System.out.println("Average = " + result);
    }
}