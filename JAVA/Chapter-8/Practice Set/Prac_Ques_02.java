// WAP to create a class cellphone with method to print "ringing....", "vibrating....", etc.

class CellPhone {
    public void ringing() {
        System.out.println("Ringing....");
    }

    public void vibrating() {
        System.out.println("Vibrating....");
    }

    public void callFriend() {
        System.out.println("Calling to ChutMarike....");
    }
}

public class Prac_Ques_02 {
    public static void main(String[] args) {
        CellPhone poco = new CellPhone();
        poco.callFriend();
        poco.vibrating();
        poco.ringing();
    }
}