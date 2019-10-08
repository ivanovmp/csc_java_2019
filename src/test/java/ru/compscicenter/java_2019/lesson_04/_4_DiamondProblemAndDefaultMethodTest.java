package ru.compscicenter.java_2019.lesson_04;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _4_DiamondProblemAndDefaultMethodTest {

    interface Human {
        default String sound() {
            return "hello";
        }
    }

    interface Bull {
        default String sound() {
            return "moo";
        }
    }

    class Minotaur implements Human, Bull {
        //both interfaces implement same default method
        //has to be overridden
        @Override
        public String sound() {
            return Bull.super.sound();
        }
    }

    @Test
    public void multipleInheritance() {
        Minotaur minotaur = new Minotaur();
        assertEquals(__, minotaur.sound());
    }

}
