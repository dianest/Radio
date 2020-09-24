package ru.netology.domain;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private static final int MIN_STATION_NUMBER = 0;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    private int currentStationNumber;
    private int volume;
    private int stationsCount = 10;

}

