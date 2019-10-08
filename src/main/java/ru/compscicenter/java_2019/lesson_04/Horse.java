package ru.compscicenter.java_2019.lesson_04;

public class Horse extends Animal implements Galloping {

    public Horse(long birthInMillis) {
        super(birthInMillis);
    }

    @Override
    public String gallop() {
        return "tygydym!";
    }

    @Override
    String getName() {
        return "Horse";
    }

}
