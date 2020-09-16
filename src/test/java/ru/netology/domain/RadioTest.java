package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void nextStationBasic() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void nextStationBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void previousStationBasic() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        radio.previousStation();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void previousStationBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStationNumber());
    }


    @Test
    void increaseVolumeBasic() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    void increaseVolumeBorder() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void decreaseVolumeBasic() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }

    @Test
    void decreaseVolumeBorder() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}