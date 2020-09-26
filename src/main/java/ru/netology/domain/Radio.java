package ru.netology.domain;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class Radio {
    private static final int MIN_STATION_NUMBER = 0;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;


    private int currentStationNumber;
    private int volume;
    private int stationsCount = 10;

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public void nextStation() {
        if (currentStationNumber == stationsCount - 1) {
            currentStationNumber = MIN_STATION_NUMBER;
        } else {
            currentStationNumber++;
        }
    }

    public void previousStation() {
        if (currentStationNumber == MIN_STATION_NUMBER) {
            currentStationNumber = stationsCount - 1;
        } else {
            currentStationNumber--;
        }
    }

    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > stationsCount) {
            return;
        }
        if (currentStationNumber < MIN_STATION_NUMBER) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            return;
        }
        if (volume < MIN_VOLUME) {
            return;
        }
        this.volume = volume;
    }
}
