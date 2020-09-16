package ru.netology.domain;

public class Radio {
    private int currentStationNumber;
    private int volume;

    public void nextStation() {
        if (currentStationNumber == 9){
            currentStationNumber = 0;
        } else {
            ++currentStationNumber;
        }
    }

    public void previousStation() {
        if (currentStationNumber == 0){
            currentStationNumber = 9;
        } else {
            --currentStationNumber;
        }
    }

    public void increaseVolume() {
        if (volume < 10){
            ++volume;
        }
    }

    public void decreaseVolume() {
        if (volume > 0){
            --volume;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}

