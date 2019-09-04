package ru.compscicenter.java_2019.lesson_03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _4_ComparableTest {

    @Test
    public void compareObjects() {
        String a = "abc";
        String b = "bcd";
        assertEquals(a.compareTo(b), __);
        assertEquals(a.compareTo(a), __);
        assertEquals(b.compareTo(a), __);
    }

    @Test
    public void makeObjectsComparable() {
        Car vwbeetle = new Car(50);
        Car porsche = new Car(500);
        assertEquals(vwbeetle.compareTo(porsche), __);
    }

    @Test
    public void makeObjectsComparableWithoutComparable() {

        class HorseAgeComparator implements Comparator<RaceHorse> {
            public int compare(RaceHorse o1, RaceHorse o2) {
                return o1.age - o2.age;
            }
        }

        RaceHorse lindy = new RaceHorse(2, 10);
        RaceHorse lightning = new RaceHorse(10, 2);
        RaceHorse slowy = new RaceHorse(1, 10);

        RaceHorse[] horses = {lindy, slowy, lightning};

        Arrays.sort(horses, new HorseAgeComparator());
        assertEquals(horses[0], __);

        Arrays.sort(horses, new Comparator<RaceHorse>() {
            @Override
            public int compare(RaceHorse o1, RaceHorse o2) {
                return o1.age - o2.age;
            }
        });
        assertEquals(horses[0], __);

        Arrays.sort(horses, (o1, o2) -> o1.speed/o1.age - o2.speed/o2.age);
        assertEquals(horses[0], __);

        Arrays.sort(horses, Comparator.comparingInt(o -> o.speed / o.age));
        assertEquals(horses[0], __);

    }

}
