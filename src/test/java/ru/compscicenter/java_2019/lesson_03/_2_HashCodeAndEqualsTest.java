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
        assertEquals(__, object == sameObject);
        assertEquals(__, object == new Object());
    }

    @Test
    public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame() {
        Object object = new Object();
        assertEquals(__, object.equals(object));
        assertEquals(__, object.equals(new Object()));
    }

    @Test
    public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual() {
        Object object = 1;
        assertEquals(__, object.equals(object));
        assertEquals(__, object.equals(1));
        // Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
        // but for the class 'Integer' there is difference - see below
    }

    @Test
    public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqualExample() {
        Integer value1 = 4;
        Integer value2 = 2 + 2;
        assertEquals(__, value1.equals(value2));
        assertEquals(__, value1);
    }

    @Test
    public void objectsNeverEqualNull() {
        assertEquals(__, new Object().equals(null));
    }

    @Test
    public void objectsEqualThemselves() {
        Object obj = new Object();
        assertEquals(__, obj.equals(obj));
    }

    @Test
    public void equalityOfObjectsOfDifferentClasses() {
        Integer i = 1;
        Long l = 1L;
        assertEquals(__, i.intValue() == l.longValue());
        assertEquals(__, i.equals(l));
    }

    @Test
    public void mainContractBetweenHashcodeAndEquals() {
        Integer i1 = 42;
        Integer i2 = 42;
        assertEquals(__, i1 == i2);
        assertEquals(__, i1.equals(i2));
        assertEquals(__, i1.hashCode() == i2.hashCode());
    }

}
