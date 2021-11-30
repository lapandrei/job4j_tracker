package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(" Поезд тронулся с места.");
    }

    @Override
    public void speed() {
        System.out.println("Скорость поезда 89 км/ч");
    }
}
