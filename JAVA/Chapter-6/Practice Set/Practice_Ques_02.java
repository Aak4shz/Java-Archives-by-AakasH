// Question 2. Create an Arrays of Floats and calculate their sum.
public class Practice_Ques_02 {
    public static void main(String[] args) {
        float[] floatArray = { 5.4f, 7.5f, 8.1f, 6.2f, 1.6f, 4.7f, 7.3f };
        float sum = 0;
        for (float num : floatArray) {
            sum += num;
        }
        System.out.println("Float Array Elements : ");
        for (float num : floatArray) {
            System.out.println(num + "");
        }
        System.out.println("\nSum of Float Array Elements : " + sum);
    }

}
