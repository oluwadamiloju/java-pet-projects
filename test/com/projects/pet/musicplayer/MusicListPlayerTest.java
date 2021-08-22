package com.projects.pet.muiscplayer;

import com.projects.pet.musicplayer.MusicList;
import com.projects.pet.musicplayer.MusicPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicListPlayerTest {
    private MusicPlayer mp3;
    private MusicList songs;

    @BeforeEach
    void setUp() {
        mp3 = new MusicPlayer();
        songs = new MusicList();
    }

    @Test
    void testThatMusicPlayerIsOffByDefault() {
        assertFalse(mp3.isOn());
    }

//    @Test
//    void testThatMusicPlayerCanBeTurnedOn() {
//        assertFalse(mp3.isOn());
//
//        mp3.turnOn();
//        mp3.turnOff();
//        mp3.turnOn();
////        assertFalse(mp3.isOn());
//
//        assertTrue(mp3.isOn());
//    }

    @Test
    void testThatPowerSwitchWorks() {
        assertFalse(mp3.isOn());
        mp3.powerSwitch();
        assertTrue(mp3.isOn());
    }

//    @Test
//    void testThatMusicPlayerCanDownloadMusicWhenOn() {
//        assertTrue(mp3.turnOn());
//        assertEquals(mp3.numberOfSongs + 1, mp3.downloadMusic());
//    }
//
//    @Test
//    void testThatMusicPlayerCannotDownloadMusicWhenOff() {
//        assertFalse(mp3.isOn);
//        assertEquals(mp3.numberOfSongs, mp3.downloadMusic());
//    }

    @Test
    void increaseVolumeOfMusicPlayer() {
//        assertTrue(mp3.turnOn());
        mp3.increaseVolume();
//        assertEquals();
    }

}
