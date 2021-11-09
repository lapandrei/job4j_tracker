package ru.job4j.oop;

public class Battery {
    private int value;

    public Battery(int value) {
        this.value = value;
    }

    public void exchange(Battery another) {
        another.value += this.value;
        this.value = 0;
    }
}
