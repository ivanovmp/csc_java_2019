package ru.compscicenter.java_2019.lesson_01;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _2_ArithmeticOperatorsTest {

    @Test
    public void simpleOperations() {
        assertEquals(1, __);
        assertEquals(1 + 1, __);
        assertEquals(2 + 3 * 4, __);
        assertEquals((2 + 3) * 4, __);
        assertEquals(2 * 3 + 4, __);
        assertEquals(2 - 3 + 4, __);
        assertEquals(2 + 4 / 2, __);
        assertEquals((2 + 4) / 2, __);
    }

    @Test
    public void notSoSimpleOperations() {
        assertEquals(1 / 2, __);
        assertEquals(3 / 2, __);
        assertEquals(1 % 2, __);
        assertEquals(3 % 2, __);
    }

    @Test
    public void minusMinusVariableMinusMinus() {
        int i = 1;
        assertEquals(--i, __);
        assertEquals(i, __);
        assertEquals(i--, __);
        assertEquals(i, __);
    }

    @Test
    public void plusPlusVariablePlusPlus() {
        int i = 1;
        assertEquals(++i, __);
        assertEquals(i, __);
        assertEquals(i++, __);
        assertEquals(i, __);
    }

    @Test
    public void timesAndDivInPlace() {
        int i = 1;
        i *= 2;
        assertEquals(i, __);
        i /= 2;
        assertEquals(i, __);
    }

}
