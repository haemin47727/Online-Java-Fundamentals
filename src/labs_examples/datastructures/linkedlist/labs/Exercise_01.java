package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise_01 {
    public static void main(String[] args) {
        // 1) Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        System.out.println("1. Created LinkedList: " + list);

        // 2) add()
        list.add("Apple");
        list.add("Banana");
        System.out.println("2. After add(): " + list);

        // 3) addAll()
        List<String> newFruits = List.of("Cherry", "Date");
        list.addAll(newFruits);
        System.out.println("3. After addAll(): " + list);

        // 4) addFirst()
        list.addFirst("Avocado");
        System.out.println("4. After addFirst(): " + list);

        // 5) addLast()
        list.addLast("Elderberry");
        System.out.println("5. After addLast(): " + list);

        // 6) getFirst()
        String first = list.getFirst();
        System.out.println("6. getFirst(): " + first);

        // 7) getLast()
        String last = list.getLast();
        System.out.println("7. getLast(): " + last);

        // 8) get()
        String second = list.get(1);
        System.out.println("8. get(1): " + second);

        // 9) set()
        list.set(1, "Blueberry");
        System.out.println("9. After set(1, \"Blueberry\"): " + list);

        // 10) push()
        list.push("Fig"); // same as addFirst
        System.out.println("10. After push(): " + list);

        // 11) pop()
        String popped = list.pop(); // removes and returns first element
        System.out.println("11. pop(): " + popped);
        System.out.println("    List after pop(): " + list);

        // 12) remove()
        list.remove("Date");
        System.out.println("12. After remove(\"Date\"): " + list);

        // 13) contains()
        boolean hasCherry = list.contains("Cherry");
        System.out.println("13. contains(\"Cherry\"): " + hasCherry);

        // 14) listIterator()
        System.out.print("14. listIterator(): ");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 15) clear()
        list.clear();
        System.out.println("15. After clear(): " + list);
    }
}
