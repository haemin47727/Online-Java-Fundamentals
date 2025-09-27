package labs_examples.datastructures.hashmap.labs;

/**
 * HashMaps Exercise_02
 * <p>
 * Create a new class that does the following:
 * <p>
 * 1) create a LinkedList
 * 2) create a Stack
 * 3) create a Queue
 * 4) create a HashMap
 * <p>
 * Then, add millisecond timers before and after each data structure above and print out
 * how long it takes for each to complete EACH the following tasks, and the total time for
 * each data structure:
 * <p>
 * 1) add 100 elements
 * 2) update 100 elements
 * 3) search for 100 elements
 * 4) delete 100 elements
 */

import java.util.*;

public class Exercise_03 {
    public static void main(String[] args) {
        int totalItems = 100;


        LinkedList<String> myList = new LinkedList<>();
        long startList = System.currentTimeMillis();


        for (int i = 0; i < totalItems; i++) {
            myList.add("Item" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myList.set(i, "Updated" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myList.contains("Updated" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myList.removeFirst();
        }

        long endList = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (endList - startList) + " ms");


        Stack<String> myStack = new Stack<>();
        long startStack = System.currentTimeMillis();


        for (int i = 0; i < totalItems; i++) {
            myStack.push("Item" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myStack.set(i, "Updated" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myStack.contains("Updated" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myStack.pop();
        }

        long endStack = System.currentTimeMillis();
        System.out.println("Stack time: " + (endStack - startStack) + " ms");


        Queue<String> myQueue = new LinkedList<>();
        long startQueue = System.currentTimeMillis();


        for (int i = 0; i < totalItems; i++) {
            myQueue.add("Item" + i);
        }


        List<String> tempList = new ArrayList<>(myQueue);
        for (int i = 0; i < totalItems; i++) {
            tempList.set(i, "Updated" + i);
        }
        myQueue.clear();
        myQueue.addAll(tempList);


        for (int i = 0; i < totalItems; i++) {
            myQueue.contains("Updated" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myQueue.poll();
        }

        long endQueue = System.currentTimeMillis();
        System.out.println("Queue time: " + (endQueue - startQueue) + " ms");


        HashMap<String, String> myMap = new HashMap<>();
        long startMap = System.currentTimeMillis();


        for (int i = 0; i < totalItems; i++) {
            myMap.put("Key" + i, "Value" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myMap.put("Key" + i, "Updated" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myMap.containsKey("Key" + i);
        }


        for (int i = 0; i < totalItems; i++) {
            myMap.remove("Key" + i);
        }

        long endMap = System.currentTimeMillis();
        System.out.println("HashMap time: " + (endMap - startMap) + " ms");
    }
}