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
        assertEquals(list.get(0), __);
        assertEquals(list.get(1), __);
        assertEquals(list.get(2), __);

        assertEquals(list.size(), __);
        list.remove("Chicken");
        list.remove("Chicken");
        assertEquals(list.contains("Chicken"), __);
        assertEquals(list.contains("Cat"), __);

        int i = 0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            i++;
        }
        assertEquals(i, __);

    }

    @Test
    public void usingALinkedList() {
        // List = interface
        List<String> list = new LinkedList<>();
        // ArrayList: simple List implementation
        list.add("Chicken");
        list.add("Dog");
        list.add("Chicken");
        assertEquals(list.get(0), __);
        assertEquals(list.get(1), __);
        assertEquals(list.get(2), __);
        int i = 0;
        for (String s : list) {
            i++;
        }
        assertEquals(i, __);
    }

    @Test
    public void usingAQueue() {
        // Queue = interface
        Queue<String> queue = new PriorityQueue<>();
        // PriorityQueue: simple queue implementation
        queue.add("Cat");
        queue.add("Dog");
        assertEquals(queue.peek(), __);
        assertEquals(queue.size(), __);
        assertEquals(queue.poll(), __);
        assertEquals(queue.size(), __);
        assertEquals(queue.poll(), __);
        assertEquals(queue.isEmpty(), __);
    }

    @Test
    public void usingABasicSet() {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Dog");
        assertEquals(set.size(), __);
        assertEquals(set.contains("Dog"), __);
        assertEquals(set.contains("Cat"), __);
        assertEquals(set.contains("Chicken"), __);
    }

    @Test
    public void usingABasicMap() {
        Map<String, String> map = new HashMap<>();
        map.put("first key", "first value");
        map.put("second key", "second value");
        map.put("first key", "other value");
        assertEquals(map.size(), __);
        assertEquals(map.containsKey("first key"), __);
        assertEquals(map.containsKey("second key"), __);
        assertEquals(map.containsValue("first value"), __);
        assertEquals(map.get("first key"), __);
    }

    @Test
    public void usingBackedArrayList() {
        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);
        list.set(0, "x");
        assertEquals(array[0], __);
        array[0] = "a";
        assertEquals(list.get(0), __);
        // Just think of it as quantum state teleportation...
    }

    @Test
    public void usingBackedSubMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("a", "Aha");
        map.put("b", "Boo");
        map.put("c", "Coon");
        map.put("e", "Emu");
        map.put("f", "Fox");
        map.put("d", "Dog");

        assertEquals(map.size(), __);
        assertEquals(map.containsKey("d"), __);
        assertEquals(map.containsValue("Foo"), __);
        // Again: backed maps are just like those little quantum states
        // that are connected forever...
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry);
        }
        assertEquals(sb.toString(), __);
    }

    @Test
    public void differenceBetweenOrderedAndSorted() {
        SortedSet<String> sorted = new TreeSet<>();
        sorted.add("c");
        sorted.add("z");
        sorted.add("a");
        assertEquals(sorted.first(), __);
        assertEquals(sorted.last(), __);
        // Look at the different constructors for a TreeSet (or TreeMap)
        // Ponder how you might influence the sort order. Hold that thought
        // until you approach AboutComparison

        LinkedHashSet<String> ordered = new LinkedHashSet<>();
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
