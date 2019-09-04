package ru.compscicenter.java_2019.lesson_03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _2_HashCodeAndEqualsTest {

    @Test
    public void doubleEqualsTestsIfTwoObjectsAreTheSame() {
        Object object = new Object();
        Object sameObject = object;
        assertEquals(object == sameObject, __);
        assertEquals(object == new Object(), __);
    }

    @Test
    public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame() {
        Object object = new Object();
        assertEquals(object.equals(object), __);
        assertEquals(object.equals(new Object()), __);
    }

    @Test
    public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual() {
        Object object = 1;
        assertEquals(object.equals(object), __);
        assertEquals(object.equals(1), __);
        // Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
        // but for the class 'Integer' there is difference - see below
    }

    @Test
    public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqualExample() {
        Integer value1 = 4;
        Integer value2 = 2 + 2;
        assertEquals(value1.equals(value2), __);
        assertEquals(value1, __);
    }

    @Test
    public void objectsNeverEqualNull() {
        assertEquals(new Object().equals(null), __);
    }

    @Test
    public void objectsEqualThemselves() {
        Object obj = new Object();
        assertEquals(obj.equals(obj), __);
    }

    @Test
    public void equalityOfObjectsOfDifferentClasses() {
        Integer i = 1;
        Long l = 1L;
        assertEquals(i.intValue() == l.longValue(), __);
        assertEquals(i.equals(l), __);
    }

    @Test
    public void mainContractBetweenHashcodeAndEquals() {
        Integer i1 = 42;
        Integer i2 = 42;
        assertEquals(i1 == i2, __);
        assertEquals(i1.equals(i2), __);
        assertEquals(i1.hashCode() == i2.hashCode(), __);
    }

}
