package ru.netology.stats.java12.service;

public class Radio {
    private int station;
    private int volume;

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public int getStation() {

        return station;
    }

    public void nextStation() {
        if (station != 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prevStation() {
        if (station != 0) {
            station = station - 1;
        } else {
            station = 9;
        }
    }

 //   public void prevStationZero() {
 //       if (station <= 0) {
 //           station = station - 1;
 //       } else {
 //           station = 9;
//        }
  //  }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 100) {
            return;
        }
        if (volume <= 0) {
            return;
        }

        this.volume = volume;
    }


    public void increaseVolume() {
        if (volume > 0) {
            volume++;
        } else {
            volume = 100;
        }


    }

    public void decreaseVolume() {
        if (volume != 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }


}