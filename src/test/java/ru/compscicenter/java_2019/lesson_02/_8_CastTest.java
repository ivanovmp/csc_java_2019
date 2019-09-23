package ru.compscicenter.java_2019.lesson_02;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _8_CastTest {

    @Test
    public void castIntToLong() {
        int i = 55;
        long l = i;
        Assert.assertEquals(l, __);
    }

    @Test
    public void castLongToint() {
        long l = 12345678987654321L;
        int i = (int) l;
        Assert.assertEquals(i, __);
    }

}
