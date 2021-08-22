import java.util.ArrayList;

public class MusicList {
    private static ArrayList<Music> musiclist = new ArrayList<>();

    public static int getNumberOfSongs() {
        return musiclist.size();
    }
}
