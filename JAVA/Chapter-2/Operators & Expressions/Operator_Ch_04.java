/*                   POSTFIX AND PREFIX
 Postfix :- The current value of the variable is used first in the expression,
 and then the variable’s value is changed.

 Prefix :- The variable’s value is changed first,
 and then the updated value is used in the expression. */

public class Operator_Ch_04 {
    public static void main (String [] args) {

     // POSTFIX INCREMENT & DECREMENT OPERATORS 

        int a = 100 ;
        System.out.println( a++ );
        System.out.println(a);
        int c = 100 ;
        System.out.println( c-- );
        System.out.println(c);

        // PREFIX INCREMENT & DECREMENT OPERATORS

        int b = 998 ;
        System.out.println( ++b );

        int d = 1000 ;
        System.out.println( --d);

        // Question 1 : What will be the value of following expression ?
        // int x = 7 ;
        // int y = ++x * 8 ;
        // value of y = ?

        int x = 7 ;
        int y = ++x * 8 ;
        //  x = 8 & y = * 8
        //  y = 8 * 8 = 64
        System.out.println(" Value of x is " + x );
        System.out.println(" Value of y is " + y );
       // OUTPUT : Value of x = 8
       // OUTPUT : Value of y = 64
       
       char ch = 'A' ;
       System.out.println( ++ch );
       // OUTPUT : B


       char ch1 = 'Y' ;
       System.out.println(ch1++);
       System.out.println(ch1);
         // OUTPUT1 : Y
         // OUTPUT2 : Z
    }
}
