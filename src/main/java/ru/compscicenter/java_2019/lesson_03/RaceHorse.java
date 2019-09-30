package ru.compscicenter.java_2019.lesson_03;

class RaceHorse {

    final int speed;
    final int age;

    public RaceHorse(int speed, int age) {
        this.speed = speed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Speed: " + speed + " Age: " + age;
    }
}
