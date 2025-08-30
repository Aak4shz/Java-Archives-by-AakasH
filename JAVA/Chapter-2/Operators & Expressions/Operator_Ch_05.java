// Arithmetics operators uses...

public interface Operator_Ch_05 {
    public static void main(String[] args) {
        int a = 65;
        int b = 25;
        int c = 92;
        int d = 48;
        
        // Addition of given number 

        int sum = (a + b + c + d);
        System.out.print("The sum of number ");
        System.out.println(sum);

        // Subtract Given number 
        int Sub = (a-b-c-d);
        System.out.print("The Sub is ");
        System.out.println(Sub);

        // Multiply Given numbers 

        int Multiple = (a * b * c * d);
        System.out.print("The Multiple of numbers is ");
        System.out.println(Multiple);

        // Average Given number by 5

        float Avg = (sum/5);
        System.out.print("The result is ");
        System.out.println(Avg);

    }
}