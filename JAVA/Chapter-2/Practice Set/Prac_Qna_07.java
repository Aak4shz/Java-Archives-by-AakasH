// Write a program to demonstrate difference between post-increment and pre-increment.

    public class Prac_Qna_07 {
        public static void main(String[] args) {
            // Post Increment 
            int a = 10;
            System.out.println("Post Increment Example : ");
            System.out.println("a = " + a);
            System.out.println("a++ = : " + (a++));
            System.out.println("Now a = : " + a);

            // Post Decrement 

            int x = 11;
            System.out.println("\nPost Decrement Example : ");
            System.out.println("x = " + x);
            System.out.println("x-- = : " + (x--));
            System.out.println("Now x = : " + x);

            // Pre Increment 
            int b = 100;
            System.out.println("\nPre Increment Example : ");
            System.out.println("b = " + b);
            System.out.println("++b = : " + (++b));
            System.out.println("Now b = : " + b);

            // Pre Decrement 

            int z = 111;
            System.out.println("\nPre Decrement Example : ");
            System.out.println("z = " + z);
            System.out.println("--z = : " + (--z));
            System.out.println("Now z = : " + z);
    }
}
