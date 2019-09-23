package ru.compscicenter.java_2019.lesson_02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _5_LoopsTest {

    @Test
    public void basicForLoop1() {
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += i + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void basicForLoop2() {
        String s = "";
        for (int i = -5; i < 1; i++) {
            s += i + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void basicForLoop3() {
        String s = "";
        for (int i = 5; i > 0; i--) {
            s += i + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void basicForLoop4() {
        String s = "";
        for (int i = 0; i < 11; i += 2) {
            s += i + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void basicForLoop5() {
        String s = "";
        for (int i = 1; i <= 16; i *= 2) {
            s += i + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void basicForLoopWithTwoVariables1() {
        String s = "";
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
            s += i + " " + j + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void nestedLoops() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += "(" + i + ", " + j + ") ";
            }
            s += " - ";
        }
        assertEquals(__, s);
    }

    @Test
    public void forEachLoop() {
        int[] is = {1, 2, 3, 4};
        String s = "";
        for (int j : is) {
            s += j + " ";
        }
        assertEquals(__, s);
    }

    @Test
    public void whileLoop() {
        int result = 0;
        while (result < 3) {
            result++;
        }
        assertEquals(__, result);
    }

    @Test
    public void doWhileLoop() {
        int result = 0;
        do {
            result++;
        } while (false);
        assertEquals(__, result);
    }

    @Test
    public void forEachLoopBreak() {
        String[] sa = {"Dog", "Cat", "Tiger"};
        int count = 0;
        for (String current : sa) {
            if ("Cat".equals(current)) {
                break;
            }
            count++;
        }
        assertEquals(__, count);
    }

    @Test
    public void forEachLoopContinue() {
        String[] sa = {"Dog", "Cat", "Tiger"};
        int count = 0;
        for (String current : sa) {
            if ("Dog".equals(current)) {
                continue;
            } else {
                count++;
            }
        }
        assertEquals(__, count);
    }

    @Test
    public void forLoopContinueLabel() {
        int count = 0;
        outerLabel:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                count++;
                if (count > 2) {
                    continue outerLabel;
                }
            }
            count += 10;
        }
        // What does continue with a label mean?
        // What gets executed? Where does the program flow continue?
        assertEquals(__, count);
    }

    @Test
    public void forLoopBreakLabel() {
        int count = 0;
        outerLabel:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                if (count > 2) {
                    break outerLabel;
                }
            }
            count += 10;
        }
        // What does break with a label mean?
        // What gets executed? Where does the program flow continue?
        assertEquals(__, count);
    }
}
