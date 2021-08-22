public class MusicPlayer {
    private boolean isOn;
    int numberOfSongs;
    int[] volumeArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int volume;

    public MusicPlayer() {}
    public MusicPlayer(boolean isOn, int volume) {
        this.isOn = isOn;
        this.numberOfSongs = MusicList.getNumberOfSongs();
        this.volumeArray = volumeArray;
        this.volume = volume;
    }

    private void turnOn() {
        this.isOn = true;
    }

    private void turnOff() {
        this.isOn = false;
    }

    public void powerSwitch() {
        if(isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public int downloadMusic() {
        if (isOn) {
            numberOfSongs += 1;
        } else {
            return numberOfSongs;
        }
        return numberOfSongs;
    }

    public int increaseVolume() {
        for(int i = 0; i < volumeArray.length; i++) {
            return volumeArray[i++];
        }
        return 0;
    }

    public boolean isOn() {
        return isOn;
    }
}
