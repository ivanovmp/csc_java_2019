package ru.compscicenter.java_2019.lesson_03;

import java.util.Objects;

class CloneableFoo implements Cloneable {

    final private int i;

    public CloneableFoo(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneableFoo foo = (CloneableFoo) o;
        return i == foo.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

}
