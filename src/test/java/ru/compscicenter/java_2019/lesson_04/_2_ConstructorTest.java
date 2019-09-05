package ru.compscicenter.java_2019.lesson_04;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _2_ConstructorTest {

    class A {
        String someString = "a";

        public A() {
            someString += "x";
        }

    }

    class B extends A {
        public B() {
            someString += "g";
        }

    }

    @Test
    public void simpleConstructorOrder() {
        assertEquals(new B().someString, __);
    }

    class Aa {
        String someString = "a";

        public Aa() {
            someString += "x";
        }

        public Aa(String s) {
            someString += s;
        }
    }

    class Bb extends Aa {
        public Bb() {
            super("Boo");
            someString += "g";
        }

    }

    @Test
    public void complexConstructorOrder() {
        assertEquals(new Bb().someString, __);
    }

}
