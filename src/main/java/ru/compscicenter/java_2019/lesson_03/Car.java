package ru.compscicenter.java_2019.lesson_03;

class Car implements Comparable<Car> {

    final int horsepower;

    Car(int horsepower) {
        this.horsepower = horsepower;
    }

    // For an explanation for this implementation look at
    // http://download.oracle.com/javase/6/docs/api/java/lang/Comparable.html#compareTo(T)
    public int compareTo(Car o) {
        return horsepower - o.horsepower;
    }

}
