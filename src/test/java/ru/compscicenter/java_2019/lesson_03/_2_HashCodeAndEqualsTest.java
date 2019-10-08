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
        assertEquals(true, object == sameObject);
        assertEquals(false, object == new Object());
    }

    @Test
    public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame() {
        Object object = new Object();
        assertEquals(true, object.equals(object));
        assertEquals(false, object.equals(new Object()));
    }

    @Test
    public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual() {
        Object object = 1;
        assertEquals(true, object.equals(object));
        assertEquals(true, object.equals(1));
        // Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
        // but for the class 'Integer' there is difference - see below
    }

    @Test
    public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqualExample() {
        Integer value1 = 4;
        Integer value2 = 2 + 2;
        assertEquals(true, value1.equals(value2));
        assertEquals(Integer.valueOf(4), value1);
    }

    @Test
    public void objectsNeverEqualNull() {
        assertEquals(false, new Object().equals(null));
    }

    @Test
    public void objectsEqualThemselves() {
        Object obj = new Object();
        assertEquals(true, obj.equals(obj));
    }

    @Test
    public void equalityOfObjectsOfDifferentClasses() {
        Integer i = 1;
        Long l = 1L;
        assertEquals(true, i.intValue() == l.longValue());
        assertEquals(false, i.equals(l));
    }

    @Test
    public void mainContractBetweenHashcodeAndEquals() {
        Integer i1 = 42;
        Integer i2 = 42;
        assertEquals(true, i1 == i2);
        assertEquals(true, i1.equals(i2));
        assertEquals(true, i1.hashCode() == i2.hashCode());
    }

}
