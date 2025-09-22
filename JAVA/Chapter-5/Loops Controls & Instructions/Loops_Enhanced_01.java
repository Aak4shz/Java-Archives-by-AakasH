// Enhanced Loops in java...-> Also known as for-each loops.

public class Loops_Enhanced_01 {
    public static void main(String[] args) {

        int number[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // Normal Loop...
        for (int i = 0; i < number.length; i++) {
            System.out.println("Normal Loop : " + number[i]);
        }
        
        System.out.println("------------------------------");

        // Enhanced Loop...
        for (int num : number) {
            System.out.println("Enhanced Loop : " + num);
        }
    }

}

/*
 * This loop is used to directly access elements of arrays and collections (like
 * ArrayList).
 * We don’t need to write index values (i = 0, i < n) manually.
 * It automatically goes through each element one by one.
 * 
 * In short: => “Enhanced loop = easy way to read all elements without using
 * index.”
 */
