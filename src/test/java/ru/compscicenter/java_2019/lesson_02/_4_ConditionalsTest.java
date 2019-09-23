package ru.compscicenter.java_2019.lesson_02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _4_ConditionalsTest {

    @Test
    public void basicIf() {
        int x = 1;
        if (true) {
            x++;
        }
        assertEquals(__, x);
    }

    @Test
    public void basicIfElse() {
        int x = 1;
        boolean secretBoolean = false;
        if (secretBoolean) {
            x++;
        } else {
            x--;
        }
        assertEquals(__, x);
    }

    @Test
    public void basicIfElseIfElse() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        if (secretBoolean) {
            x++;
        } else if (otherBooleanCondition) {
            x = 10;
        } else {
            x--;
        }
        assertEquals(__, x);
    }

    @Test
    public void nestedIfsWithoutCurlysAreReallyMisleading() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        // Curly braces after an "if" or "else" are not required...
        if (secretBoolean)
            x++;
        if (otherBooleanCondition)
            x = 10;
        else
            x--;
        // ...but they are !!VERY!! recommended.
        assertEquals(__, x);
    }

    @Test
    public void ifAsIntended() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        // Adding curly braces avoids the "dangling else" problem seen
        // above.
        if (secretBoolean) {
            x++;
            if (otherBooleanCondition) {
                x = 10;
            }
        } else {
            x--;
        }
        assertEquals(__, x);
    }

    @Test
    public void basicSwitchStatement() {
        int i = 1;
        String result = "Basic ";
        switch (i) {
            case 1:
                result += "One";
                break;
            case 2:
                result += "Two";
                break;
            default:
                result += "Nothing";
        }
        assertEquals(__, result);
    }

    @Test
    public void switchStatementFallThrough() {
        int i = 1;
        String result = "Basic ";
        switch (i) {
            case 1:
                result += "One";
            case 2:
                result += "Two";
            default:
                result += "Nothing";
        }
        assertEquals(__, result);
    }

    @Test
    public void switchStatementCrazyFallThrough() {
        int i = 5;
        String result = "Basic ";
        switch (i) {
            case 1:
                result += "One";
            default:
                result += "Nothing";
            case 2:
                result += "Two";
        }
        assertEquals(__, result);
    }

    @Test
    public void switchStatementConstants() {
        int i = 5;
        // What happens if you remove the 'final' modifier?
        // What does this mean for case values?
        final int caseOne = 1;
        String result = "Basic ";
        switch (i) {
            case caseOne:
                result += "One";
                break;
            default:
                result += "Nothing";
        }
        assertEquals(__, result);
    }

    @Test
    public void switchStatementSwitchValues() {
        // Try different (primitive) types for 'c'
        // Which types do compile?
        // Does boxing work?
        char c = 'a';
        String result = "Basic ";
        switch (c) {
            case 'a':
                result += "One";
                break;
            default:
                result += "Nothing";
        }
        assertEquals(__, result);
    }

    @Test
    public void shortCircuit() {
        Counter trueCount = new Counter(true);
        Counter falseCount = new Counter(false);
        String x = "Hai";
        if (trueCount.count() || falseCount.count()) {
            x = "kthxbai";
        }
        assertEquals(__, x);
        assertEquals(__, trueCount.count);
        assertEquals(__, falseCount.count);
    }

    @Test
    public void bitwise() {
        Counter trueCount = new Counter(true);
        Counter falseCount = new Counter(false);
        String x = "Hai";
        if (trueCount.count() | falseCount.count()) {
            x = "kthxbai";
        }
        assertEquals(x, __);
        assertEquals(__, trueCount.count);
        assertEquals(__, falseCount.count);
    }

    @Test
    public void stringsInSwitchStatement() {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        String dangerous = null;
        String notDangerous = null;
        for (String animal : animals) {
            switch (animal) {
                case "Tiger":
                    dangerous = animal;
                case "Dog":
                case "Cat":
                case "Elephant":
                case "Zebra":
                    notDangerous = animal;
            }
        }
        assertEquals(__, notDangerous);
        assertEquals(__, dangerous);
    }

    class Counter {
        boolean returnValue;
        int count = 0;

        Counter(boolean returnValue) {
            this.returnValue = returnValue;
        }

        boolean count() {
            count++;
            return returnValue;
        }
    }
}
