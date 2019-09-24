package ru.compscicenter.java_2019.lesson_02;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _2_BitwiseOperatorsTest {

    @Test
    public void fullAnd() {
        int i = 1;
        if (true & (++i < 8)) {
            i = i + 1;
        }
        assertEquals(__, i);
    }

    @Test
    public void shortCircuitAnd() {
        int i = 1;
        if (true && (i < -28)) {
            i = i + 1;
        }
        assertEquals(__, i);
    }

    @Test
    public void aboutXOR() {
        int i = 1;
        int a = 6;
        if ((a < 9) ^ false) {
            i = i + 1;
        }
        assertEquals(__, i);
    }

    @Test
    public void dontMistakeEqualsForEqualsEquals() {
        int i = 1;
        boolean a = false;
        if (a = true) {
            i++;
        }
        assertEquals(__, a);
        assertEquals(__, i);
        // How could you write the condition 'with a twist' to avoid this trap?
    }

    @Test
    public void aboutBitShiftingRightShift() {
        int rightShift = 8;
        rightShift = rightShift >> 1;
        assertEquals(__, rightShift);
    }

    @Test
    public void aboutBitShiftingLeftShift() {
        int leftShift = 0x80000000; // Is this number positive or negative?
        leftShift = leftShift << 1;
        assertEquals(__, leftShift);
    }

    @Test
    public void aboutBitShiftingRightUnsigned() {
        int rightShiftNegativeStaysNegative = 0x80000000;
        rightShiftNegativeStaysNegative = rightShiftNegativeStaysNegative >> 4;
        assertEquals(__, rightShiftNegativeStaysNegative);
        int unsignedRightShift = 0x80000000; // always fills with 0
        unsignedRightShift >>>= 4; // Just like +=
        assertEquals(__, unsignedRightShift);
    }
}
