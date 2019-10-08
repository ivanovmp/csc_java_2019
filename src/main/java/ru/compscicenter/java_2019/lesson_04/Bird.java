package ru.compscicenter.java_2019.lesson_04;

public class Bird extends Animal implements Flying {

    public Bird(long birthInMillis) {
        super(birthInMillis);
    }

    @Override
    public String fly() {
        return "swish!";
    }

    @Override
    String getName() {
        return "Bird";
    }

}
