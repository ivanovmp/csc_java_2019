package ru.compscicenter.java_2019.lesson_01;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.JVM)
public class _1_AssertionsTest {

    @Test
    public void assertBooleanTrue() {
        // there are two possibilities, true or false, what would it be here?
        assertTrue(true);
    }

    @Test
    public void assertBooleanFalse() {
        assertFalse(false);
    }

    @Test
    public void assertNullObject() {
        // reference to the object can be null, a magic keyword, null, which means
        // that there is nothing there
        assertNull(null);
    }

    @Test
    public void assertNullObjectReference() {
        Object someObject = null;
        assertNull(someObject);
    }

    @Test
    public void assertNotNullObject() {
        // but what when there should not be a null value?
        assertNotNull(new Object());
    }

    @Test
    public void assertEqualsUsingExpression() {
        assertTrue("Hello World!".equals("Hello World!"));
    }

    @Test
    public void assertEqualsWithAFewExpressions() {
        assertEquals("Hello World!", "Hello World!");
        assertEquals(1, 1);
        assertEquals(2 + 2, 4);
        assertEquals(2 * 3, 6);
        assertEquals(3 - 8, -5);
        assertEquals(10 / 2, 5);
    }

    @Test
    public void assertEqualsWithDescriptiveMessage() {
        // Generally, when using an assertXXX methods, expectation is on the
        // left and it is best practice to use a String for the first arg
        // indication what has failed
        assertEquals("The answer to 'life the universe and everything' should be 42", 42, 42);
    }

    @Test
    public void assertSameInstance() {
        Integer original = Integer.valueOf(1);
        Integer same = original;
        Integer different = Integer.valueOf(1);
        // These are both equal to the original...
        assertEquals(original, same);
        assertEquals(original, different);
        // ...but only one refers to the same instance as the original.
        assertSame(original, same);
    }

    @Test
    public void assertNotSameInstance() {
        Integer original = Integer.valueOf(1);
        Integer same = original;
        Integer different = Integer.valueOf(1);
        // These are both equal to the original...
        assertEquals(original, same);
        assertEquals(original, different);
        // ...but only one of them refers to a different instance.
        assertNotSame(original, different);  // We want equal, but _not_ the same.
    }
}
