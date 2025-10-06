// Write a Program Create an Array of 5 float and calculate the sum.
public class Ch_Array_4 {
    public static void main(String[] args) {
        float [] numbers = { 1.5f, 4.8f, 5.0f, 8.9f, 11.1f};
        float sum = 0;
        for (float num : numbers){
            sum += num;
        }
        System.out.println("Arrays : ");
        for (float num : numbers){
            System.out.println(num + " ");
        }
        System.out.println("\nsum : " + sum);
        
    }
}
