package ru.compscicenter.java_2019.lesson_02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

public class _7_AutoboxingTest {

    @Test
    public void addPrimitivesToCollection() {
        List<Integer> list = new ArrayList<>();
        list.add(0, new Integer(42));
        assertEquals(list.get(0), __);
    }

    @Test
    public void addPrimitivesToCollectionWithAutoBoxing() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 42);
        list.add(1, 84);
        assertEquals(list.get(0), __);
        assertEquals(list.get(1), __);
    }

    @Test
    public void allPrimitivesCanBeAutoboxed() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(0, 42d);
        assertEquals(doubleList.get(0), __);

        List<Long> longList = new ArrayList<>();
        longList.add(0, 42L);
        assertEquals(longList.get(0), __);

        List<Character> characterList = new ArrayList<>();
        characterList.add(0, 'z');
        assertEquals(characterList.get(0), __);
    }

}
