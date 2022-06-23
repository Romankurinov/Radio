package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void  radioStationNextTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  radioStationPrevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  soundMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  soundMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}