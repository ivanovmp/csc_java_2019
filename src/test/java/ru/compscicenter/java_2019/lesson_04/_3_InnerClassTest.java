package ru.compscicenter.java_2019.lesson_04;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _3_InnerClassTest {

    private int x = 10;

    int theAnswer() {
        return 42;
    }

    interface Ignoreable {
        String ignoreAll();
    }

    class Inner {

        public String doStuff() {
            return "stuff";
        }

        private int returnOuter() {
            return x; //can access private fields of outer class!
        }

    }

    @Test
    public void creatingInnerClassInstance() {
        Inner inner = new Inner();
        assertEquals(__, inner.doStuff());
    }

    @Test
    public void creatingInnerClassInstanceWithOtherSyntax() {
        _3_InnerClassTest.Inner inner = this.new Inner();
        assertEquals(__, inner.doStuff());
    }

    @Test
    public void accessingInnerClassMembers() {
        Inner inner = new Inner();
        assertEquals(__, inner.returnOuter());
    }

    @Test
    public void innerClassesInMethods() {
        class MethodInnerClass {

            int fortyTwo() {
                return x;
            }

        }
        assertEquals(__, new MethodInnerClass().fortyTwo());
        // Where can you use this class?
    }

    class AnotherInnerClass {

        int thousand() {
            return 1000;
        }

        AnotherInnerClass crazyReturn() {
            class SpecialInnerClass extends AnotherInnerClass {
                int thousand() {
                    return 2000;
                }
            }
            return new SpecialInnerClass();
        }
    }

    @Test
    public void innerClassesInMethodsThatEscape() {
        AnotherInnerClass ic = new AnotherInnerClass();
        assertEquals(__, ic.thousand());
        AnotherInnerClass crazy = ic.crazyReturn();
        assertEquals(__, crazy.thousand());
    }


    @Test
    public void creatingAnonymousInnerClasses() {
        _3_InnerClassTest anonymous = new _3_InnerClassTest() {
            int theAnswer() {
                return 23;
            }
        };// <- Why do you need a semicolon here?
        assertEquals(__, anonymous.theAnswer());
    }

    @Test
    public void creatingAnonymousInnerClassesToImplementInterface() {
        Ignoreable ignoreable = new Ignoreable() {
            public String ignoreAll() {
                return null;
            }
        };
        // Complete the code so that the statement below is correct.
        // Look at the test above for inspiration
        // TODO here!
        assertEquals(ignoreable.ignoreAll(), "SomeInterestingString");
        // Did you just created an object of an interface type?
        // Or did you create a class that implemented this interface and
        // an object of that type?
    }

    @Test
    public void innerClassAndInheritance() {
        Inner inner = new Inner();
        // The statement below is obvious...
        // Try to change the 'Inner' below to "AnotherInnerClass'
        // Why do you get an error?
        // What does that imply for inner classes and inheritance?
        assertEquals(__, inner instanceof Inner);
    }

    class AnotherInner extends _3_InnerClassTest {
    }

    @Test
    public void innerClassAndInheritanceOther() {
        AnotherInner anotherInner = new AnotherInner();
        // What do you expect here?
        // Compare this result with the last test. What does that mean?
        assertEquals(__, anotherInner instanceof _3_InnerClassTest);
    }

    static class StaticInnerClass {

        public int importantNumber() {
            return 42; //can't access private fields of outer class!
        }

    }

    @Test
    public void staticInnerClass() {
        StaticInnerClass someObject = new StaticInnerClass();
        assertEquals(__, someObject.importantNumber());
        // What happens if you try to access 'x' or 'theAnswer' from the outer class?
        // What does this mean for static inner classes?
    }

    @Test
    public void staticInnerClassFullyQualified() {
        _3_InnerClassTest.StaticInnerClass someObject = new _3_InnerClassTest.StaticInnerClass();
        assertEquals(__, someObject.importantNumber());
    }

}
