package ru.compscicenter.java_2019.lesson_02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _8_CastTest {

    @Test
    public void castIntToLong() {
        int i = 55;
        long l = i;
        assertEquals(__, l);
    }

    @Test
    public void castLongToint() {
        long l = 2_147_483_648L;
        int i = (int) l;
        assertEquals(__, i);
    }

}
