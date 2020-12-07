package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int station;
    private int volume;
    private int count;

    public void setStation(int station) {

        if (station < 0) {
            return;
        }
        if (station > this.count) {
            this.station = this.count;
            return;
        }
        this.station = station;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (this.getVolume() == 100) {
            return;
        }
        this.volume++;
    }

    public void decreaseVolume() {
        if (this.getVolume() == 0) {
            return;
        }
        this.volume--;
    }

    public void nextStation() {
        if (this.getStation() == this.count) {
            this.setStation(0);
            return;
        }
        this.station++;
    }

    public void previousStation() {
        if (this.getStation() == 0) {
            this.setStation(this.count);
            return;
        }
        this.station--;
    }


}