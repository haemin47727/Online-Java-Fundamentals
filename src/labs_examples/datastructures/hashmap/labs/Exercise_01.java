package labs_examples.datastructures.hashmap.labs;

/**
 * HashMaps Exercise_01
 * <p>
 * Demonstrate your mastery of using Java's built-in HashMap class below.
 * <p>
 * Using a HashMap demonstrate the use of the following methods:
 * <p>
 * put()
 * get()
 * putAll()
 * size()
 * contains()
 * keySet()
 * entrySet()
 * putIfAbsent()
 * remove()
 * replace()
 * forEach()
 * clear()
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise_01 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();


        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        System.out.println("After put(): " + map);


        int value = map.get("banana");
        System.out.println("Value for 'banana': " + value);


        HashMap<String, Integer> moreFruits = new HashMap<>();
        moreFruits.put("date", 40);
        moreFruits.put("elderberry", 50);
        map.putAll(moreFruits);
        System.out.println("After putAll(): " + map);


        System.out.println("Size of map: " + map.size());


        boolean has30 = map.containsValue(30);
        System.out.println("Contains value 30? " + has30);


        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        map.putIfAbsent("fig", 60);
        map.putIfAbsent("apple", 100); // won't overwrite
        System.out.println("After putIfAbsent(): " + map);


        map.remove("banana");
        System.out.println("After remove('banana'): " + map);


        map.replace("cherry", 35);
        System.out.println("After replace('cherry', 35): " + map);


        System.out.println("Using forEach:");
        map.forEach((key, val) -> System.out.println(key + " => " + val));


        map.clear();
        System.out.println("After clear(): " + map);
    }
}