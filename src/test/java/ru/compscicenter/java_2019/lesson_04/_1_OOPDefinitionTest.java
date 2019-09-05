package ru.compscicenter.java_2019.lesson_04;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import ru.compscicenter.java_2019.lesson_04.inner_package.AccessDemoDescendant;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _1_OOPDefinitionTest {

    @Test
    public void objectClass() {
        Object o = new Object();
        assertEquals(Object.class, o.getClass());
        assertEquals(o.getClass().getName(), __);
    }

    @Test
    public void incapsulation() {
        AccessDemo demo = new AccessDemo(1, 2, 3, 4);

        demo.publicField = 5;
        assertEquals(demo.getPublicField(), __);
        //test is in the same package
        demo.packageField = 6;
        assertEquals(demo.getPackageField(), __);
        demo.protectedField = 7;
        assertEquals(demo.getProtectedField(), __);

        AccessDemoDescendant anotherDemo = new AccessDemoDescendant(5, 6, 7, 8);

        assertEquals(anotherDemo.testAccessToProtectedField(), __);

        demo.changePrivateFieldAsIHave(anotherDemo);
        assertEquals(anotherDemo.getPrivateField(), __);
    }

    @Test
    public void hierarchyAndPolymorphism() {
        Vehicle v = new Vehicle();
        Bike b = new Bike();
        Track t = new Track();

        List<Vehicle> vehicles = List.of(v, b, t);

        StringBuilder sb = new StringBuilder();
        for (Vehicle vehicle : vehicles) {
            sb.append(vehicle.makeSound());
        }
        assertEquals(sb.toString(), __);

        assertEquals(b.makeSound(), __);
        assertEquals(b.makeSound(3), __);

    }

    @Test
    public void aggregationCompositionLifecycle() {
        Car car = new Car(new Wheel());
        assertEquals(car.wheel != null, __);

        Wheel wheel = new Wheel();
        Car anotherCar = new Car(wheel);
        assertEquals(anotherCar.wheel == wheel, __);
    }

    @Test
    public void diamondProblemSolution() {
        Horse horse = new Horse(123456L);
        Bird bird = new Bird(654321L);
        Pegasus pegasus = new Pegasus(42L);

        assertEquals(pegasus instanceof Animal, __);
        assertEquals(pegasus instanceof Flying, __);
        assertEquals(pegasus instanceof Galloping, __);
        assertEquals(pegasus instanceof Object, __);

        Animal a = pegasus;
        assertEquals(a instanceof Bird, __);

        Object o = pegasus;
        assertEquals(o instanceof Number, __);

        List<Flying> flyings = List.of(bird, pegasus);

        StringBuilder sb = new StringBuilder();
        for (Flying f : flyings) {
            sb.append(f.fly());
        }
        assertEquals(sb.toString(), __);

        List<Galloping> gallopings = List.of(horse, pegasus);

        sb = new StringBuilder();
        for (Galloping g : gallopings) {
            sb.append(g.gallop());
        }
        assertEquals(sb.toString(), __);
    }

}
