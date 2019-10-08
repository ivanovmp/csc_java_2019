package ru.compscicenter.java_2019.lesson_04;

abstract class Animal {

    private long birthInMillis;

    protected Animal(long birthInMillis) {
        this.birthInMillis = birthInMillis;
    }

    abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

}
