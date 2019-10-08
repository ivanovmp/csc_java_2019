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
        assertEquals(__, blue == Colors.Blue);
        assertEquals(__, blue == Colors.Red);
        assertEquals(__, blue instanceof Colors);
        assertEquals(__, blue instanceof Enum);
    }

    @Test
    public void basicEnumsAccess() {
        Colors[] colorArray = Colors.values();
        assertEquals(__, colorArray[2]);
        assertEquals(__, colorArray[1].name());
        assertEquals(__, Colors.valueOf("Green"));
        assertEquals(__, Colors.valueOf("Black"));
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
        assertEquals(__, SkatSuits.Clubs.value > SkatSuits.Spades.value);
    }

    enum OpticalMedia {
        CD(650),
        DVD(4300),
        BluRay(50000);

        OpticalMedia(int capacity) {
            capacityInMegaBytes = capacity;
        }

        int capacityInMegaBytes;

        int getCoolnessFactor() {
            return (capacityInMegaBytes - 1000) * 10;
        }
    }

    @Test
    public void enumsWithMethods() {
        assertEquals(__, OpticalMedia.CD.getCoolnessFactor());
        assertEquals(__, OpticalMedia.BluRay.getCoolnessFactor());
    }

    @Test
    public void ordinals() {
        assertEquals(__, OpticalMedia.CD.ordinal());
        assertEquals(__, OpticalMedia.DVD.ordinal());
        assertEquals(__, OpticalMedia.BluRay.ordinal());
    }
}
