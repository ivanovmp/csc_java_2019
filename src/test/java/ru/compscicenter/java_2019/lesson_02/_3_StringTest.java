package ru.compscicenter.java_2019.lesson_02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.text.MessageFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _3_StringTest {

    @Test
    public void implicitStrings() {
        assertEquals(__, "just a plain old string".getClass());
    }

    @Test
    public void newString() {
        // very rarely if ever should Strings be created via new String() in
        // practice - generally it is redundant, and done repetitively can be slow
        String string = new String();
        String empty = "";
        assertEquals(__, string.equals(empty));
    }

    @Test
    public void newStringIsRedundant() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(__, stringInstance.equals(stringReference));
    }

    @Test
    public void newStringIsNotIdentical() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(__, stringInstance == stringReference);
    }

    @Test
    public void stringIsEmpty() {
        assertEquals(__, "".isEmpty());
        assertEquals(__, "one".isEmpty());
        assertEquals(__, new String().isEmpty());
        assertEquals(__, new String(new char[]{'w'}).isEmpty());
        assertEquals(__, new String("one").isEmpty());
    }

    @Test
    public void stringLength() {
        assertEquals(__, "".length());
        assertEquals(__, "one".length());
        assertEquals(__, "the number is one".length());
    }

    @Test
    public void stringTrim() {
        assertEquals(__, "".trim());
        assertEquals(__, "one".trim());
        assertEquals(__, " one more time".trim());
        assertEquals(__, " one more time         ".trim());
        assertEquals(__, " and again\t".trim());
        assertEquals(__, "\t\t\twhat about now?\t".trim());
    }

    @Test
    public void stringConcatenation() {
        String one = "one";
        String space = " ";
        String two = "two";
        assertEquals(__, one + space + two);
        assertEquals(__, space + one + two);
        assertEquals(__, two + space + one);
    }

    @Test
    public void stringUpperCase() {
        String str = "I am a number one!";
        assertEquals(__, str.toUpperCase());
    }

    @Test
    public void stringLowerCase() {
        String str = "I AM a number ONE!";
        assertEquals(__, str.toLowerCase());
    }

    @Test
    public void stringCompare() {
        String str = "I AM a number ONE!";
        assertEquals(__, str.compareTo("I AM a number ONE!") == 0);
        assertEquals(__, str.compareTo("I am a number one!") == 0);
        assertEquals(__, str.compareTo("I AM A NUMBER ONE!") == 0);
    }

    @Test
    public void stringCompareIgnoreCase() {
        String str = "I AM a number ONE!";
        assertEquals(__, str.compareToIgnoreCase("I AM a number ONE!") == 0);
        assertEquals(__, str.compareToIgnoreCase("I am a number one!") == 0);
        assertEquals(__, str.compareToIgnoreCase("I AM A NUMBER ONE!") == 0);
    }

    @Test
    public void stringStartsWith() {
        assertEquals(__, "".startsWith("one"));
        assertEquals(__, "one".startsWith("one"));
        assertEquals(__, "one is the number".startsWith("one"));
        assertEquals(__, "ONE is the number".startsWith("one"));
    }

    @Test
    public void stringEndsWith() {
        assertEquals(__, "".endsWith("one"));
        assertEquals(__, "one".endsWith("one"));
        assertEquals(__, "the number is one".endsWith("one"));
        assertEquals(__, "the number is two".endsWith("one"));
        assertEquals(__, "the number is One".endsWith("one"));
    }

    @Test
    public void stringSubstring() {
        String str = "I AM a number ONE!";
        assertEquals(__, str.substring(0));
        assertEquals(__, str.substring(1));
        assertEquals(__, str.substring(5));
        assertEquals(__, str.substring(14, 17));
        assertEquals(__, str.substring(7, str.length()));
    }

    @Test
    public void stringContains() {
        String str = "I AM a number ONE!";
        assertEquals(__, str.contains("one"));
        assertEquals(__, str.contains("ONE"));
    }

    @Test
    public void stringReplace() {
        String str = "I am a number ONE!";
        assertEquals(__, str.replace("ONE", "TWO"));
        assertEquals(__, str.replace("I am", "She is"));
    }

    @Test
    public void stringBuilderCanActAsAMutableString() {
        assertEquals(__, new StringBuilder("one").append(" ").append("two").toString());
    }

    @Test
    public void readableStringFormattingWithStringFormat() {
        assertEquals(__, String.format("%s %s %s", "a", "b", "a"));
    }

    @Test
    public void extraArgumentsToStringFormatGetIgnored() {
        assertEquals(__, String.format("%s %s %s", "a", "b", "c", "d"));
    }

    @Test
    public void insufficientArgumentsToStringFormatCausesAnError() {
        try {
            String.format("%s %s %s", "a", "b");
            fail("No Exception was thrown!");
        } catch (Exception e) {
            assertEquals(__, e.getClass());
            assertEquals(__, e.getMessage());
        }
    }

    @Test
    public void readableStringFormattingWithMessageFormat() {
        assertEquals(__, MessageFormat.format("{0} {1} {0}", "a", "b"));
    }

    @Test
    public void extraArgumentsToMessageFormatGetIgnored() {
        assertEquals(__, MessageFormat.format("{0} {1} {0}", "a", "b", "c"));
    }

    @Test
    public void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
        assertEquals(__, MessageFormat.format("{0} {1} {0}", "a"));
    }


}
