import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MusicPlayerTests {
    MusicPlayer mp3;

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

    }
}
