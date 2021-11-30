package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle pasTrain = new Train();
        Vehicle carTrain = new Train();
        Vehicle pasPlane = new Plane();
        Vehicle carPlane = new Plane();
        Vehicle cityBus = new Bus();
        Vehicle countryBus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{pasTrain, carTrain,
                pasPlane, carPlane, cityBus, countryBus};
        for (Vehicle a : vehicles) {
            a.move();
            a.speed();
        }
    }
}
