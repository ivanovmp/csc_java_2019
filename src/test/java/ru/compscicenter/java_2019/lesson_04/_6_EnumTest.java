package ru.compscicenter.java_2019.lesson_04;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _6_EnumTest {

    enum Colors {
        Red,
        Blue,
        Green,
        Yellow
        // what happens if you add a ; here?
        // What happens if you type Red() instead?
    }

    @Test
    public void basicEnums() {
        Colors blue = Colors.Blue; //it's a constant, always the same instance returned
        assertEquals(blue == Colors.Blue, __);
        assertEquals(blue == Colors.Red, __);
        assertEquals(blue instanceof Colors, __);
    }

    @Test
    public void basicEnumsAccess() {
        Colors[] colorArray = Colors.values();
        assertEquals(colorArray[2], __);
        assertEquals(colorArray[1].name(), __);
        assertEquals(Colors.valueOf("Green"), __);
        assertEquals(Colors.valueOf("Black"), __);
    }

    enum SkatSuits {

        Clubs(12),
        Spades(11),
        Hearts(10),
        Diamonds(9);

        SkatSuits(int v) {
            value = v;
        }

        private int value;
    }

    @Test
    public void enumsWithAttributes() {
        // value is private but we still can access it. Why?
        // Try moving the enum outside the AboutEnum class... What do you expect?
        // What happens?
        assertEquals(SkatSuits.Clubs.value > SkatSuits.Spades.value, __);
    }

    enum OpticalMedia {
        CD(650),
        DVD(4300),
        BluRay(50000);

        OpticalMedia(int c) {
            capacityInMegaBytes = c;
        }

        int capacityInMegaBytes;

        int getCoolnessFactor() {
            return (capacityInMegaBytes - 1000) * 10;
        }
    }

    @Test
    public void enumsWithMethods() {
        assertEquals(OpticalMedia.CD.getCoolnessFactor(), __);
        assertEquals(OpticalMedia.BluRay.getCoolnessFactor(), __);
    }

    @Test
    public void ordinals() {
        assertEquals(OpticalMedia.CD.ordinal(), __);
        assertEquals(OpticalMedia.DVD.ordinal(), __);
        assertEquals(OpticalMedia.BluRay.ordinal(), __);
    }
}
