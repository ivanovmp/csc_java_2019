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
        assertSame(clone.getClass(), f.getClass());
        assertEquals(true, f.equals(clone));
    }

    @Test
    public void cloneComplexObjectsAsShallowCopy() throws CloneNotSupportedException {
        CloneableFoo cloneableFoo = new CloneableFoo(42);
        ComposedCloneableFoo composed = new ComposedCloneableFoo(cloneableFoo);
        ComposedCloneableFoo composedClone = composed.clone();

        assertEquals(false, composed == composedClone);
        assertEquals(true, composed.getFoo().equals(composedClone.getFoo()));
        assertEquals(true, composed.getFoo().hashCode() == composedClone.getFoo().hashCode());
        assertEquals(true, composed.getFoo() == composedClone.getFoo());

    }

    @Test
    public void cloneArray() {
        int[] ints = {1, 2, 3, 4};
        int[] clone = ints.clone();
        assertEquals(ints.getClass(), clone.getClass());
        assertEquals(false, clone == ints);
        assertEquals(false, clone.equals(ints));
        assertEquals(true, Arrays.equals(clone, ints));
        assertEquals(3, clone[2]);
    }

}
