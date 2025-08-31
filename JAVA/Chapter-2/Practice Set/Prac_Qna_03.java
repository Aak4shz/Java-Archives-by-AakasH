/* What will be the output of the following Java program, 
   and explain how the expressions for variables a and b are evaluated?
 */

public class Prac_Qna_03 {
    public static void main(String[] args) {
        // Associativity Question --> Left to Right 
        float a = 7 / 4f * 9 / 2f ;

        /*    7 / 4f = 1.75
            1.75 * 9 = 15.75
          15.75 / 2f = 7.875  */

        double b = 100 / 3d * 10 + 97 / 7d - 100 ;

        /*         100 / 3d = 33.333...
             33.333... * 10 = 333.333...
                    97 / 7d = 13.857...
     333.333... + 13.857... = 347.190...
           347.190... - 100 = 247.190...  */

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        double sum = a + b ;
        System.out.println("sum : " + sum);
    }
}

/* Output :- 
            a =    7.875
            b =  247.1904761904762
          sum =  255.0654761904762
 */