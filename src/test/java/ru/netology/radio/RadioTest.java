package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void  radioStationNextMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  turningOnTheRadioStationTest() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  radioStationMoreMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  radioStationLessMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  radioStationNextTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  radioStationPrevMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  radioStationPrevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

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
    public void  soundMoreMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(14);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  addingVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 5;

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
    @Test
    public void  soundLessMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  volumeReductionTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}