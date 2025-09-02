// Write a java program to convert total second in Hours ,Minutes and Seconds

public class Prac_Qna_08 {
    public static void main(String[] args) {
        int totalSecond = 660660;

        int Hours = totalSecond / 3600;
        int Minutes = (totalSecond % 3600) / 60;
        int Seconds = totalSecond % 60;

        System.out.println("Hours : " + Hours);
        System.out.println("Minutes : " + Minutes);
        System.out.println("Seconds : " + Seconds);

    }
}
/*
 * Output :-
 * Hours : 183
 * Minutes : 29
 * Seconds : 20
 */