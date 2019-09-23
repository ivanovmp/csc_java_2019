package ru.compscicenter.java_2019.lesson_02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _7_AutoboxingTest {

    @Test
    public void addPrimitivesToCollection() {
        List<Integer> list = new ArrayList<>();
        list.add(0, new Integer(42));
        assertEquals(__, list.get(0));
    }

    @Test
    public void addPrimitivesToCollectionWithAutoBoxing() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 42);
        list.add(1, 84);
        assertEquals(__, list.get(0));
        assertEquals(__, list.get(1));
    }

    @Test
    public void allPrimitivesCanBeAutoboxed() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(0, 42d);
        assertEquals(__, doubleList.get(0));

        List<Long> longList = new ArrayList<>();
        longList.add(0, 42L);
        assertEquals(__, longList.get(0));

        List<Character> characterList = new ArrayList<>();
        characterList.add(0, 'z');
        assertEquals(__, characterList.get(0));
    }

    @Test
    public void surprise() {
        Integer i = getInteger();
        if (i > 0) {
            i++;
        } else {
            i--;
        }
        assertEquals(__, i);
    }

    private Integer getInteger() {
        return null;
    }

}
