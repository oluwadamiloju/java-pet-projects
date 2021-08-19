public class MusicPlayer {
    boolean isOn;
    int numberOfSongs;

    public boolean turnOn() {
        return !isOn;
    }

    public boolean turnOff() { return isOn; }

    public void powerSwitch() {
        if(isOn) {
            turnOn();
        } else {
            turnOff();
        }
    }

    public int downloadMusic() {
        if (turnOn()) {
            numberOfSongs += 1;
        } else {
            return numberOfSongs;
        }
        return numberOfSongs;
    }
}
