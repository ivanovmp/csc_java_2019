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

        public int returnOuter() {
            return x; //can access private fields of outer class!
        }
    }

    @Test
    public void creatingInnerClassInstance() {
        Inner someObject = new Inner();
        assertEquals(someObject.doStuff(), __);
    }

    @Test
    public void creatingInnerClassInstanceWithOtherSyntax() {
        _3_InnerClassTest.Inner someObject = this.new Inner();
        assertEquals(someObject.doStuff(), __);
    }

    @Test
    public void accessingOuterClassMembers() {
        Inner someObject = new Inner();
        assertEquals(someObject.returnOuter(), __);
    }

    @Test
    public void innerClassesInMethods() {
        class MethodInnerClass {
            int oneHundred() {
                return 100;
            }
        }
        assertEquals(new MethodInnerClass().oneHundred(), __);
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
        assertEquals(ic.thousand(), __);
        AnotherInnerClass theCrazyIC = ic.crazyReturn();
        assertEquals(theCrazyIC.thousand(), __);
    }


    @Test
    public void creatingAnonymousInnerClasses() {
        _3_InnerClassTest anonymous = new _3_InnerClassTest() {
            int theAnswer() {
                return 23;
            }
        };// <- Why do you need a semicolon here?
        assertEquals(anonymous.theAnswer(), __);
    }

    @Test
    public void creatingAnonymousInnerClassesToImplementInterface() {
        Ignoreable ignoreable = new Ignoreable() {
            public String ignoreAll() {
                return null;
            }
        }; // Complete the code so that the statement below is correct.
        // Look at the test above for inspiration
        assertEquals(ignoreable.ignoreAll(), "SomeInterestingString");
        // Did you just created an object of an interface type?
        // Or did you create a class that implemented this interface and
        // an object of that type?
    }

    @Test
    public void innerClassAndInheritance() {
        Inner someObject = new Inner();
        // The statement below is obvious...
        // Try to change the 'Inner' below to "AboutInnerClasses'
        // Why do you get an error?
        // What does that imply for inner classes and inheritance?
        assertEquals(someObject instanceof Inner, __);
    }

    class OtherInner extends _3_InnerClassTest {
    }

    @Test
    public void innerClassAndInheritanceOther() {
        OtherInner someObject = new OtherInner();
        // What do you expect here?
        // Compare this result with the last test. What does that mean?
        assertEquals(someObject instanceof _3_InnerClassTest, __);
    }

    static class StaticInnerClass {
        public int importantNumber() {
            return 3; //can't access private fields of outer class!
        }
    }

    @Test
    public void staticInnerClass() {
        StaticInnerClass someObject = new StaticInnerClass();
        assertEquals(someObject.importantNumber(), __);
        // What happens if you try to access 'x' or 'theAnswer' from the outer class?
        // What does this mean for static inner classes?
        // Try to create a sub package of this package which is named 'StaticInnerClass'
        // Does it work? Why not?
    }

    @Test
    public void staticInnerClassFullyQualified() {
        _3_InnerClassTest.StaticInnerClass someObject = new _3_InnerClassTest.StaticInnerClass();
        assertEquals(someObject.importantNumber(), __);
    }

}
