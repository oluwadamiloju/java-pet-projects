import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTests {
    private MusicPlayer mp3;

    @BeforeEach
    void setUp() {
        mp3 = new MusicPlayer();
    }

    @Test
    void testThatMusicPlayerIsOffByDefault() {
        assertFalse(mp3.isOn);
    }

    @Test
    void testThatMusicPlayerCanBeTurnedOn() {
        assertTrue(mp3.turnOn());
    }

    @Test
    void testThatMusicPlayerCanDownloadMusicWhenOn() {
        assertTrue(mp3.turnOn());
        assertEquals(mp3.numberOfSongs + 1, mp3.downloadMusic());
    }
}
