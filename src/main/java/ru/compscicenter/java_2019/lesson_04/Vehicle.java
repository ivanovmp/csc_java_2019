package ru.compscicenter.java_2019.lesson_04;

public class Vehicle {

    public String makeSound() {
        return "bzzzzzz!";
    }

    public String makeSound(int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(makeSound());
        }
        return sb.toString();
    }

}