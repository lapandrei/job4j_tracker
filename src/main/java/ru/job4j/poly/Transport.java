package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int numOfPas);

    double refuel(double fuel);
}
