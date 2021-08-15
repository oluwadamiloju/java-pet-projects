public class MusicPlayer {
    boolean isOn;
    int numberOfSongs;

    public boolean turnOn() {
        return !isOn;
    }

    public int downloadMusic() {
        if (turnOn()) {
            numberOfSongs += 1;
        }
        return numberOfSongs;
    }
}
