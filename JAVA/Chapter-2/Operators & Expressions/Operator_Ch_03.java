/*             PRECEDENCE & ASSOCIATIVITY
Precedence defines the priority/order of operators in an expression, i.e.,
   which operator will be evaluated first when multiple operators are present.

    Precedence = Who comes first.
    Associativity = In which direction it is solved when equal. */

public class Operator_Ch_03 {
    public static void main (String [] args){
         int a = 8*4-4/2;

         /* = 32 - 4/2
          * = 32 - 2
          * = 30
          */

          int b = 60/5 - 34*2;

         /* = 12 - 34*2
          * = 12 - 68
          * = -56
          */
          
         System.out.println(a);
         System.out.println(b);
    }
}
