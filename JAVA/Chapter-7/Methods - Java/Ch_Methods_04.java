
// Method Overloading - Multiple methods with same name but different parameters
public class Ch_Methods_04 {
    static void change(int a){
        a = 121;
    }
    static void change2(int [] arr){
        arr[3] = 1000;
    } 
    static void telljoke(){
        System.out.println("Why can't you trust the king of the jungle?\r\n" +
        "Because he's always lion.");
    }
    public static void main(String[] args) {
        telljoke();

        int [] marks = {1, 11, 111, 1111, 11111, 111111};
        int x = 111;
        change(x);
        System.out.println("The value of x before changing : " + x);

        // Changing the Array 
        change2(marks);
        System.out.println("The value of x after running change : " + marks[3]);
    }
}
