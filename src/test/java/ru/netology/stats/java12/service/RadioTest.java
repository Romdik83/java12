package ru.netology.stats.java12.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void nextStation() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationZero() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setStation(6);
        radio.prevStation();
        int expected = 5;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationZero() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setVolume(51);
        radio.decreaseVolume();
        int expected = 50;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStationMax() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setStation(11);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationMin() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void designer() {
        Radio radio = new Radio(7,3,83,14);
        Assertions.assertEquals(7,radio.getMaxStation());
        Assertions.assertEquals(3,radio.getMinStation());
        Assertions.assertEquals(83,radio.getMaxVolume());
        Assertions.assertEquals(14,radio.getMinVolume());
    }
}
