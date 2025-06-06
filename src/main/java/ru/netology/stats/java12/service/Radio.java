package ru.netology.stats.java12.service;

public class Radio {
    private int numberStation = 10;
    private int minStation = 0;
    private int maxStation = numberStation - 1;
    private int station = minStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio(int quantityStation, int quantityVolume) {
        this.maxStation = quantityStation - 1;
        this.maxVolume = quantityVolume - 1;
    }

    public Radio(int numberStation) { // конструктор для задания числа радиостанций
        maxStation = numberStation - 1;
    }

    public Radio() { // конструктор для задания числа радиостанций по умолчанию

    }

    public void setStation(int station) {
        if (station < minStation) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        this.station = station;
    }

    public int getStation() {
        return station;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void nextStation() {
        if (station != maxStation) {
            station++;
        } else {
            station = minStation;
        }
    }

    public void prevStation() {
        if (station != minStation) {
            station = station - 1;
        } else {
            station = maxStation;
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setVolume(int volume) {
        if (volume >= maxVolume) {
            return;
        }
        if (volume <= minVolume) {
            return;
        }

        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume > minVolume) {
            volume++;
        } else {
            volume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (volume != minVolume) {
            volume = volume - 1;
        } else {
            volume = minVolume;
        }
    }
}