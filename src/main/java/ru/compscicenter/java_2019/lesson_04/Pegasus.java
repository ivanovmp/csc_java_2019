package ru.compscicenter.java_2019.lesson_04;

public class Pegasus extends Animal implements Flying, Galloping {

    public Pegasus(long birthInMillis) {
        super(birthInMillis);
    }

    @Override
    public String fly() {
        return "magic-swish!";
    }

    @Override
    public String gallop() {
        return "magic-tygydym!";
    }

    @Override
    String getName() {
        return "Pegasus";
    }

}
