package Junit_and_generics.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        map.add("key1", "value1");
        map.add("key1", "value2");
        map.add("key2", "value3");
        Assertions.assertEquals(2, map.getValues("key1").size());
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testGetFirst() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals(map.getFirst("key"),"value1");
    }

    @Test
    public void testContainsKey() {
        Assertions.assertEquals(false, map.containsKey("dadas"));
    }

    @Test
    public void testSize() {
        map.add("key", "value1");
        map.add("key", "value2");
        map.add("key2", "value1");
        map.add("key2", "value2");
        map.add("key3", "value1");
        map.add("key3", "value2");
        map.add("key3", "value1");
        map.add("key3", "value2");
        Assertions.assertEquals(3, map.size());
    }

    @Test
    public void testRemoveKey() {
        map.add("key", "value1");
        map.add("key", "value2");
        map.add("key2", "value3");
        map.add("key2", "value4");
        map.add("key2", "value5");
        Assertions.assertEquals(3, map.remove("key2").size());
    }

    @Test
    public void testAddAllWithList() {
        List<String> els = new ArrayList<>();
        els.add("1");
        els.add("2");
        els.add("3");
        els.add("4");
        map.addAll("key", els);
        Assertions.assertEquals(4, map.getValues("key").size());
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        MultiMapValue<String, String> my_new_map = new MultiMapValue<>();
        my_new_map.add("key", "1");
        my_new_map.add("key", "2");
        my_new_map.add("key", "3");
        my_new_map.add("key2", "4");
        my_new_map.add("key3", "5");
        my_new_map.add("key2", "6");
        map.addAll(my_new_map);
        Assertions.assertEquals("4", map.getFirst("key2"));
    }
}
