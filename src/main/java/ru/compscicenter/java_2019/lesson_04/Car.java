package ru.compscicenter.java_2019.lesson_04;

public class Car {

    Wheel wheel;

    public Car() {
        wheel = new Wheel();
    }

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

}
