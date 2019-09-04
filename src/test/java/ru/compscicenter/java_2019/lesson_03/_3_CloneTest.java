package ru.compscicenter.java_2019.lesson_03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
        assertSame(f.getClass(), __);
        assertEquals(f, __);
    }

    @Test
    public void cloneComplexObjectsAsShallowCopy() throws CloneNotSupportedException {
        CloneableFoo cloneableFoo = new CloneableFoo(42);
        ComposedCloneableFoo composedCloneableFoo = new ComposedCloneableFoo(cloneableFoo);
        ComposedCloneableFoo clone = composedCloneableFoo.clone();

        assertNotSame(composedCloneableFoo, clone);
        assertEquals(composedCloneableFoo.getFoo(), __);
        assertSame(composedCloneableFoo.getFoo(), __);

    }

    @Test
    public void cloneArray() {
        int[] ints = {1, 2, 3, 4};
        int[] clone = ints.clone();
        assertEquals(clone[2], __);
    }

}
