package ru.netology.domain;

public class Radio {
    private static final int MIN_STATION_NUMBER = 0;
    private static final int MAX_STATION_NUMBER = 9;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 10;

    private int currentStationNumber;
    private int volume;

    public void nextStation() {
        if (currentStationNumber == MAX_STATION_NUMBER) {
            currentStationNumber = MIN_STATION_NUMBER;
        } else {
            currentStationNumber++;
        }
    }

    public void previousStation() {
        if (currentStationNumber == MIN_STATION_NUMBER) {
            currentStationNumber = MAX_STATION_NUMBER;
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

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > MAX_STATION_NUMBER) {
            return;
        }
        if (currentStationNumber < MIN_STATION_NUMBER) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getVolume() {
        return volume;
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

