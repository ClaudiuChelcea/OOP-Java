package Junit_and_generics.task1;

import java.util.*;

/* HashMap<K, ArrayList<V» */
public class MultiMapValue<K, V> {
    /* Fields */
    private HashMap<K, ArrayList<V>> my_hashmap = new HashMap<>();

    public void add(K key, V value) {
        ArrayList<V> arr = my_hashmap.get(key);
        if(arr == null)
            arr = new ArrayList<>();
        arr.add(value);
        my_hashmap.put(key, arr);
    }

    public void addAll(K key, List<V> values) {
        if(my_hashmap == null)
            my_hashmap = new HashMap<>();

        if(my_hashmap.get(key) != null) {
            for (var value : values)
                my_hashmap.get(key).add(value);
        } else {
            my_hashmap.put(key, (ArrayList<V>) values);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        for (var el : map.my_hashmap.entrySet()) {
            my_hashmap.put(el.getKey(), el.getValue());
        }
    }

    public V getFirst(K key) {
        return my_hashmap.get(key).get(0);
    }

    public ArrayList<V> getValues(K key) {
        return my_hashmap.get(key);
    }

    public boolean containsKey(K key) {
        return my_hashmap.containsKey(key);
    }

    public boolean isEmpty() {
        return my_hashmap.size() == 0;
    }

    public ArrayList<V> remove(K key) {
        var tmp = my_hashmap.get(key);
        my_hashmap.remove(key);
        return tmp;
    }

    public int size() {
        return my_hashmap.size();
    }
}
