package ru.compscicenter.java_2019.lesson_03;

import java.util.Objects;

public class ComposedCloneableFoo implements Cloneable {

    final private CloneableFoo foo;

    public ComposedCloneableFoo(CloneableFoo foo) {
        this.foo = foo;
    }

    public CloneableFoo getFoo() {
        return foo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComposedCloneableFoo that = (ComposedCloneableFoo) o;
        return foo.equals(that.foo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo);
    }

    @Override
    public ComposedCloneableFoo clone() throws CloneNotSupportedException {
        //here we can return anything of any class!
        return (ComposedCloneableFoo) super.clone();
    }

}
