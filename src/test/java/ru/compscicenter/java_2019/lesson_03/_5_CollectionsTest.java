package ru.compscicenter.java_2019.lesson_03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _5_CollectionsTest {

    @Test
    public void usingAnArrayList() {
        // List = interface
        List<String> list = new ArrayList<>();
        // ArrayList: simple List implementation
        list.add("Chicken");
        list.add("Dog");
        list.add("Chicken");
        assertEquals("Chicken", list.get(0));
        assertEquals("Dog", list.get(1));
        assertEquals("Chicken", list.get(2));

        assertEquals(3, list.size());
        list.remove("Chicken");
        list.remove("Chicken");
        assertEquals(false, list.contains("Chicken"));
        assertEquals(false, list.contains("Cat"));

        int i = 0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            i++;
        }
        assertEquals(i, 1);

        list.add(1, "Cat");
        list.add(2, "Cateferiy");
        assertEquals("Cateferiy", list.get(2));
    }

    @Test
    public void usingALinkedList() {
        // List = interface
        List<String> list = new LinkedList<>();
        // ArrayList: simple List implementation
        list.add("Chicken");
        list.add("Dog");
        list.add("Chicken");

        assertEquals(__, list.get(0));
        assertEquals(__, list.get(1));
        assertEquals(__, list.get(2));
        int i = 0;
        for (String s : list) {
            i++;
        }
        assertEquals(__, i);
    }

    @Test
    public void usingAQueue() {
        // Queue = interface
        Queue<String> queue = new PriorityQueue<>();
        // PriorityQueue: simple queue implementation
        queue.add("Cat");
        queue.add("Dog");
        assertEquals(__, queue.peek());
        assertEquals(__, queue.size());
        assertEquals(__, queue.poll());
        assertEquals(__, queue.size());
        assertEquals(__, queue.poll());
        assertEquals(__, queue.isEmpty());
    }

    @Test
    public void usingAHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Dog");
        assertEquals(__, set.size());
        assertEquals(__, set.contains("Dog"));
        assertEquals(__, set.contains("Cat"));
        assertEquals(__, set.contains("Chicken"));

        set.remove("Dog");
        set.remove("DOG");
        assertEquals(__, set.size());
    }

    @Test
    public void usingAHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("first key", "first value");
        map.put("second key", "second value");
        map.put("first key", "other value");
        assertEquals(__, map.size());
        assertEquals(__, map.containsKey("first key"));
        assertEquals(__, map.containsKey("second key"));
        assertEquals(__, map.containsValue("first value"));
        assertEquals(__, map.get("first key"));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        int i = 0;
        for (Map.Entry<String, String> entry : entries) {
            i++;
        }
        assertEquals(__, i);
        map.remove("second key");
        assertEquals(__, map.size());
    }

    @Test
    public void usingBackedArrayList() {
        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);
        list.set(0, "x");
        assertEquals(__, array[0]);
        array[0] = "a";
        assertEquals(__, list.get(0));
        // Just think of it as quantum state teleportation...
    }

    @Test
    public void usingBackedSubMap() {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("a", "Aha");
        map.put("b", "Boo");
        map.put("c", "Coon");
        map.put("e", "Emu");
        map.put("f", "Fox");
        map.put("d", "Dog");

        assertEquals(__, map.size());
        assertEquals(__, map.containsKey("d"));
        assertEquals(__, map.containsValue("Foo"));
        // Again: backed maps are just like those little quantum states
        // that are connected forever...

        SortedMap<String, String> subMap = map.subMap("b", "d");

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : subMap.entrySet()) {
            sb.append(entry);
        }
        assertEquals(__, sb.toString());

        subMap.put("bb", "Bee");
        assertEquals(__, map.size());
    }

    @Test
    public void differenceBetweenOrderedAndSorted() {
        SortedSet<String> sorted = new TreeSet<>();
        sorted.add("c");
        sorted.add("z");
        sorted.add("a");
        assertEquals(__, sorted.first());
        assertEquals(__, sorted.last());
        // Look at the different constructors for a TreeSet (or TreeMap)
        // Ponder how you might influence the sort order. Hold that thought
        // until you approach AboutComparison

        Set<String> ordered = new LinkedHashSet<>();
        ordered.add("c");
        ordered.add("z");
        ordered.add("a");
        StringBuffer sb = new StringBuffer();
        for (String s : ordered) {
            sb.append(s);
        }
        assertEquals(sb.toString(), __);
    }

}
