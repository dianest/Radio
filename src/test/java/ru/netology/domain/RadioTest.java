package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void createDefaultStationsNumber() {
        Radio radio = new Radio();
        assertEquals(10, radio.getStationsCount());
    }

    @Test
    void createNonDefaultStationsNumber() {
        Radio radio = new Radio(6);
        assertEquals(6, radio.getStationsCount());
    }

    @Test
    void nextStationBasic() {
        Radio radio = new Radio(2);
        radio.setCurrentStationNumber(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void nextStationBorder() {
        Radio radio = new Radio(10);
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
        Radio radio = new Radio(99);
        radio.setCurrentStationNumber(0);
        radio.previousStation();
        assertEquals(98, radio.getCurrentStationNumber());
    }

    @Test
    void setStationNumber() {
        Radio radio = new Radio(99);
        radio.setCurrentStationNumber(9);
        assertEquals(9, radio.getCurrentStationNumber());
        radio.setCurrentStationNumber(-3);
        assertEquals(9, radio.getCurrentStationNumber());
        radio.setCurrentStationNumber(101);
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
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
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

    @Test
    void setVolume() {
        Radio radio = new Radio();
        radio.setVolume(9);
        assertEquals(9, radio.getVolume());
        radio.setVolume(-3);
        assertEquals(9, radio.getVolume());
        radio.setVolume(101);
        assertEquals(9, radio.getVolume());
    }

}