package ru.netology.stats.java12.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStation() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationZero() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setStation(6);
        radio.prevStation();
        int expected = 5;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationZero() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMax() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setVolume(51);
        radio.decreaseVolume();
        int expected = 50;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationMin() {
        ru.netology.stats.java12.service.Radio radio = new ru.netology.stats.java12.service.Radio();
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
}
