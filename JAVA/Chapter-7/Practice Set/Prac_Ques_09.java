// Write a java program a function to convert celsius temperature into fahrenheit.
public class Prac_Ques_09 {
    static double Temp(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        double celsius = 32.8; // Example temperature in Celsius.
        double fahrenheit = Temp(celsius);
        System.out.println(celsius + " degrees Celsius is equal to "
                + fahrenheit + " degrees Fahrenheit.");
    }
}
