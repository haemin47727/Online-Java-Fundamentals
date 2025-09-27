package labs_examples.datastructures.hashmap.labs;

/**
 * HashMaps Exercise_02
 * <p>
 * Rewrite the CustomHashMap class to meet the following requirements:
 * 1) no method has the same name as any in CustomHashMap
 * (do not use refactor - do it manually)
 * 2) no variable has the same name as any in CustomHashMap
 * (do not use refactor - do it manually)
 * 3) resize the HashMap when the underlying array is more than half full
 * 4) triple the size of the underlying array on resize()
 * 5) instead of checking the number of keys to resize, check the number of values
 * 6) on collisions, add new elements to the front of the LinkedList, not the end
 * 7) anytime someone tries to get/update/remove an element that does not exist, print
 * out a message indicating that the element does not exist
 * 8) add at least one more method that you think could be useful to the HashMap
 * review Java's built-in HashMap for inspiration
 */

class MapNode<K, V> {
    K identifier;
    V content;
    MapNode<K, V> nextNode;

    public MapNode(K identifier, V content) {
        this.identifier = identifier;
        this.content = content;
        this.nextNode = null;
    }
}


class MissingElementException extends RuntimeException {
    public MissingElementException(String message) {
        super(message);
    }
}


public class Exercise_02<K, V> {
    private MapNode<K, V>[] storage;
    private int valueCount;

    public Exercise_02() {
        storage = new MapNode[8];
        valueCount = 0;
    }


    public void insert(K identifier, V content) {
        int index = Math.abs(identifier.hashCode()) % storage.length;
        MapNode<K, V> current = storage[index];


        while (current != null) {
            if (current.identifier.equals(identifier)) {
                current.content = content;
                return;
            }
            current = current.nextNode;
        }


        MapNode<K, V> newNode = new MapNode<>(identifier, content);
        newNode.nextNode = storage[index];
        storage[index] = newNode;
        valueCount++;


        if (valueCount > storage.length / 2) {
            expand();
        }
    }


    public V fetch(K identifier) {
        int index = Math.abs(identifier.hashCode()) % storage.length;
        MapNode<K, V> current = storage[index];

        while (current != null) {
            if (current.identifier.equals(identifier)) {
                return current.content;
            }
            current = current.nextNode;
        }

        System.out.println("Element with key '" + identifier + "' does not exist.");
        return null;
    }


    public void discard(K identifier) {
        int index = Math.abs(identifier.hashCode()) % storage.length;
        MapNode<K, V> current = storage[index];
        MapNode<K, V> previous = null;

        while (current != null) {
            if (current.identifier.equals(identifier)) {
                if (previous == null) {
                    storage[index] = current.nextNode;
                } else {
                    previous.nextNode = current.nextNode;
                }
                valueCount--;
                return;
            }
            previous = current;
            current = current.nextNode;
        }

        System.out.println("Cannot remove: key '" + identifier + "' does not exist.");
    }


    public void modify(K identifier, V newContent) {
        int index = Math.abs(identifier.hashCode()) % storage.length;
        MapNode<K, V> current = storage[index];

        while (current != null) {
            if (current.identifier.equals(identifier)) {
                current.content = newContent;
                return;
            }
            current = current.nextNode;
        }

        System.out.println("Cannot update: key '" + identifier + "' does not exist.");
    }


    public boolean hasKey(K identifier) {
        int index = Math.abs(identifier.hashCode()) % storage.length;
        MapNode<K, V> current = storage[index];

        while (current != null) {
            if (current.identifier.equals(identifier)) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }


    public void displayAll() {
        System.out.println("CustomMap contents:");
        for (int i = 0; i < storage.length; i++) {
            MapNode<K, V> current = storage[i];
            while (current != null) {
                System.out.println(current.identifier + " => " + current.content);
                current = current.nextNode;
            }
        }
    }


    private void expand() {
        MapNode<K, V>[] oldStorage = storage;
        storage = new MapNode[oldStorage.length * 3];
        valueCount = 0;

        for (MapNode<K, V> bucket : oldStorage) {
            MapNode<K, V> current = bucket;
            while (current != null) {
                insert(current.identifier, current.content);
                current = current.nextNode;
            }
        }
    }
}