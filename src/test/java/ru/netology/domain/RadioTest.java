package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);

    @Test
    void shouldSetStation(){
        radio.setStation(3);
        assertEquals(3, radio.getStation());
    }

    @Test
    void shouldSetCountStation(){
        radio.setCount(4);
        assertEquals(4,radio.getCount());
    }

    @Test
    void shouldSetPrevStation() {
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSetNextStation() {
        radio.setStation(11);
        assertEquals(10, radio.getStation());
    }

    @Test
    void shouldSetVolume() {
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
    }

    @Test
    void shouldSetUnderVolume() {
        radio.setVolume(-3);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetAboveVolume() {
        radio.setVolume(101);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        radio.setVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getVolume());
    }

    @Test
    void increaseMaxVolume() {
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(11, radio.getVolume());

    }

    @Test
    void decreaseVolume() {
        radio.setVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getVolume());
    }

    @Test
    void decreaseMinVolume() {
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void nextStation() {
        radio.setStation(8);
        radio.nextStation();
        assertEquals(9, radio.getStation());
    }

    @Test
    void nextFirstStation() {
        radio.setStation(10);
        radio.nextStation();
        assertEquals(0, radio.getStation());
    }

    @Test
    void previousStation() {
        radio.setStation(6);
        radio.previousStation();
        assertEquals(5, radio.getStation());
    }

    @Test
    void previousLastStation() {
        radio.setStation(0);
        radio.previousStation();
        assertEquals(10, radio.getStation());
    }
}
