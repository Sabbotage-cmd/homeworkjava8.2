package ru.netology.domain;

public class Radio{

    private int station;
    private int volume;
    private int count;

    public Radio(int count){
        this.count = count;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {

        if (station < 0){
            return;
        }

        if (station > this.count){
            this.station = this.count;
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (volume > 10){
            this.volume = 10;
            return;
        }

        if (volume < 0){
            return;
        }
        this.volume = volume;
    }

    public void decreaseVolume(){
        if (this.getVolume() == 0){
            return;
        }
        this.volume--;
    }

    public void increaseVolume(){
        if (this.getVolume() == 10) {
            return;
        }
        this.volume++;
    }

    public void nextStation(){
        if (this.getStation() == this.count){
            this.setStation(0);
            return;
        }
        this.station++;
    }

    public void previousStation(){
        if (this.getStation() == 0){
            this.setStation(this.count);
            return;
        }
        this.station--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
