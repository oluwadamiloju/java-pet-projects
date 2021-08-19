import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTest {
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
        assertTrue(!(mp3.isOn));
    }

    @Test
    void testThatPowerSwitchWorks() {
        mp3.powerSwitch();
        assertTrue(!(mp3.isOn));
        mp3.powerSwitch();
        assertFalse(mp3.isOn);
    }

    @Test
    void testThatMusicPlayerCanDownloadMusicWhenOn() {
        assertTrue(mp3.turnOn());
        assertEquals(mp3.numberOfSongs + 1, mp3.downloadMusic());
    }

    @Test
    void testThatMusicPlayerCannotDownloadMusicWhenOff() {
        assertFalse(mp3.isOn);
        assertEquals(mp3.numberOfSongs, mp3.downloadMusic());
    }
}
