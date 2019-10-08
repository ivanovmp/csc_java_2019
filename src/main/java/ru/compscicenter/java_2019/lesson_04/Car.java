package ru.compscicenter.java_2019.lesson_04;

public class Car {

    final private Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
