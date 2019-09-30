package ru.compscicenter.java_2019.lesson_03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.text.MessageFormat;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _1_ToStringTest {

    @Test
    public void defaultToString() {
        Object object = new Object();
        // TODO: Why is it best practice to ALWAYS override toString?
        String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
        assertEquals(__, expectedToString); // hint: object.toString()
    }

    @Test
    public void implicitToStringInvocation() {
        Integer integer = 42;
        String expectedToString = MessageFormat.format("{0}", integer);
        assertEquals(__, expectedToString);
    }

}
