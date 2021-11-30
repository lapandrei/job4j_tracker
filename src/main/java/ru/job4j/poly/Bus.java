package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void go() {
        System.out.println("Едем!");
    }

    @Override
    public void passengers(int numOfPas) {
        System.out.println("Пассажиров в автобусе " + numOfPas);
    }

    @Override
    public double refuel(double fuel) {
        double fuelPrice = 50.7;
        return fuelPrice * fuel;
    }

    @Override
    public void move() {
        System.out.println("Автобус едет по трассе М-5");
    }

    @Override
    public void speed() {
        System.out.println("Скорость автобуса 90 км/ч");
    }
}
