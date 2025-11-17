// Repeat  Question no 4 
// Write a function to print the following patten using recursion.
// * * * * *
// * * * *
// * * *
// * *
// *
public class Prac_Ques_07 {
    static void function(int n){
        if (n == 0){
            return;
        }
        for (int i = 0; i <  n; i++){
            System.out.print(" * ");
        }
        System.out.println();
        function( n -1 );        
    }
    public static void main(String[] args) {
        function(10);
    }
}
