package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 */
public class Exercise_02<T> {
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    private Node head, tail;

    public void addFirst(T data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) tail = head;
    }

    public void addLast(T data) {
        Node node = new Node(data);
        if (tail == null) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    public T removeFirst() {
        if (head == null) return null;
        T data = head.data;
        head = head.next;
        if (head == null) tail = null;
        return data;
    }

    public T removeLast() {
        if (head == null) return null;
        if (head == tail) {
            T data = head.data;
            head = tail = null;
            return data;
        }
        Node current = head;
        while (current.next != tail) current = current.next;
        T data = tail.data;
        current.next = null;
        tail = current;
        return data;
    }

    public T peekFirst() {
        return head != null ? head.data : null;
    }

    public T peekLast() {
        return tail != null ? tail.data : null;
    }
}
