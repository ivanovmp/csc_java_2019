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
        assertEquals(__, o.getClass().getName());
    }

    @Test
    public void incapsulation() {
        AccessDemo demo = new AccessDemo(1, 2, 3, 4);

        demo.publicField = 5;

        assertEquals(__, demo.getPublicField());

        demo.packageField = 6;

        assertEquals(__, demo.getPackageField());

        demo.protectedField = 7;

        assertEquals(__, demo.getProtectedField());

        AccessDemoDescendant anotherDemo = new AccessDemoDescendant(5, 6, 7, 8);

        assertEquals(__, anotherDemo.testAccessToProtectedField());

        demo.changePrivateFieldToWhatIHave(anotherDemo);

        assertEquals(__, anotherDemo.getPrivateField());
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

        assertEquals(__, sb.toString());

        assertEquals(__, b.makeSound());

        assertEquals(__, b.makeSound(3));

    }

    @Test
    public void aggregationCompositionLifecycle() {
        Car car = new Car(new Wheel());
        assertEquals(__, car.getWheel() != null);

        Wheel wheel = new Wheel();
        Car anotherCar = new Car(wheel);
        assertEquals(__, anotherCar.getWheel() == wheel);
    }

    @Test
    public void diamondProblemSolution() {
        Horse horse = new Horse(123456L);
        Bird bird = new Bird(654321L);
        Pegasus pegasus = new Pegasus(42L);

        assertEquals(__, pegasus instanceof Animal);
        assertEquals(__, pegasus instanceof Flying);
        assertEquals(__, pegasus instanceof Galloping);
        assertEquals(__, pegasus instanceof Object);

        Animal a = pegasus;
        assertEquals(__, a instanceof Bird);

        Object o = pegasus;
        assertEquals(__, o instanceof Number);

        List<Flying> flyings = List.of(bird, pegasus);

        StringBuilder sb = new StringBuilder();
        for (Flying f : flyings) {
            sb.append(f.fly());
        }
        assertEquals(__, sb.toString());

        List<Galloping> gallopings = List.of(horse, pegasus);

        sb = new StringBuilder();
        for (Galloping g : gallopings) {
            sb.append(g.gallop());
        }
        assertEquals(__, sb.toString());
    }

}
