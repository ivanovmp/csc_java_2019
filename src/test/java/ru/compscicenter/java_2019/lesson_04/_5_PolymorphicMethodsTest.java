package ru.compscicenter.java_2019.lesson_04;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _5_PolymorphicMethodsTest {

    class A {

        String doStuff(int i) {
            return "int";
        }

        String doStuff(Integer i) {
            return "Integer";
        }

        String doStuff(Object i) {
            return "Object";
        }

        String doStuff(int... i) {
            return "int vararg";
        }

    }

    @Test
    public void methodPreferenceInt() {
        assertEquals(__, new A().doStuff(1));
    }

    @Test
    public void methodPreferenceInteger() {
        assertEquals(__, new A().doStuff(Integer.valueOf(1)));
    }

    @Test
    public void methodPreferenceLong() {
        long l = 1;
        assertEquals(__, new A().doStuff(l));
    }

    @Test
    public void methodPreferenceByte() {
        byte b = 1;
        assertEquals(__, new A().doStuff(b));
    }

    @Test
    public void methodPreferenceBoxedLong() {
        Long l = Long.valueOf(1);
        assertEquals(__, new A().doStuff(l));
    }

    @Test
    public void methodPreferenceDouble() {
        Double l = Double.valueOf(1);
        assertEquals(__, new A().doStuff(l));
    }

    @Test
    public void methodPreferenceMore() {
        // What happens if you change 'Integer' to 'Double'
        // Does this explain 'methodPreferenceDouble'?
        // Think about why this happens?
        assertEquals(__, new A().doStuff(1, Integer.valueOf(2)));
    }

}
