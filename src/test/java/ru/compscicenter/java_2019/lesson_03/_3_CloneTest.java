package ru.compscicenter.java_2019.lesson_03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

import static org.junit.Assert.*;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _3_CloneTest {

    @Test
    public void cloneThrowsExceptionWithoutMarkerCloneableInterface() throws CloneNotSupportedException {
        Foo f = new Foo();
        f.clone();
    }

    @Test
    public void cloneContracts() throws CloneNotSupportedException {
        CloneableFoo f = new CloneableFoo(42);
        Object clone = f.clone();

        assertNotSame(f, clone);
        assertSame(__, f.getClass());
        assertEquals(__, f.equals(clone));
    }

    @Test
    public void cloneComplexObjectsAsShallowCopy() throws CloneNotSupportedException {
        CloneableFoo cloneableFoo = new CloneableFoo(42);
        ComposedCloneableFoo composed = new ComposedCloneableFoo(cloneableFoo);
        ComposedCloneableFoo composedClone = composed.clone();

        assertEquals(__, composed == composedClone);
        assertEquals(__, composed.getFoo().equals(composedClone.getFoo()));
        assertEquals(__, composed.getFoo().hashCode() == composedClone.getFoo().hashCode());
        assertEquals(__, composed.getFoo() == composedClone.getFoo());

    }

    @Test
    public void cloneArray() {
        int[] ints = {1, 2, 3, 4};
        int[] clone = ints.clone();
        assertEquals(__, clone.getClass());
        assertEquals(__, clone == ints);
        assertEquals(__, clone.equals(ints));
        assertEquals(__, Arrays.equals(clone, ints));
        assertEquals(__, clone[2]);
    }

}
