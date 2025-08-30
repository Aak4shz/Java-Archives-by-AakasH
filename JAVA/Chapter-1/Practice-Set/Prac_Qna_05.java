// Write a program that converts time in seconds into hours, minutes, and seconds.

public class Prac_Qna_05 {
    public static void main(String[] args) {
        int totalSeconds = 48066;
        int Hours = totalSeconds / 3600;
        int Minutes = (totalSeconds % 3600) / 60;
        int Seconds = totalSeconds % 60;
        System.out.println("Hours: " + Hours + ", Minutes: "
                + Minutes + ", Seconds: " + Seconds);

    }
}
// Output :
// Hours: 13, Minutes: 21, Seconds: 6