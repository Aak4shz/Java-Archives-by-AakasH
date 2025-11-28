/* 
* Create a class RemoteControl
* Fields:
* private volume (0–100)
* private isOn

* Tasks:
* Allow user to increase/decrease volume only if TV is ON.
* POWER button toggles ON/OFF state.
* Print full status using a method displayStatus().
 */

class RemoteControl {
    private int volume;
    private boolean isOn;

    public void increaseVolume() {
        if (isOn && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
        }
    }

    public void power() {
        isOn = !isOn;
    }

    public void displayStatus() {
        System.out.println("Volume :" + volume);
        System.out.println("TV is " + (isOn ? " ON " : " OFF "));
        System.out.println("------------------");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getOn() {
        return isOn;
    }

}

public class chapter_3 {
    public static void main(String[] args) {

        RemoteControl Remote = new RemoteControl();
        Remote.setOn(true);
        Remote.setVolume(68);
        Remote.displayStatus();

        Remote.increaseVolume();
        Remote.displayStatus();

        Remote.increaseVolume();
        Remote.displayStatus();

        Remote.increaseVolume();
        Remote.displayStatus();

        Remote.increaseVolume();
        Remote.displayStatus();

        Remote.decreaseVolume();
        Remote.displayStatus();

        Remote.power();
        Remote.displayStatus();

    }
}
