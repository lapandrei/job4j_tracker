package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(" Самолет летит на высоте  метров.");
    }

    @Override
    public void speed() {
        System.out.println(" Скорость самолета 890 км/ч ");
    }
}
