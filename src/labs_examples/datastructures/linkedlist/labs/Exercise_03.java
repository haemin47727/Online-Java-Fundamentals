package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */
public class Exercise_03 {
    class Node {
        String data;
        Node prev, next;
        Node(String data) { this.data = data; }
    }

    Node head, tail;

    void addFirst(String data) {
        Node n = new Node(data);
        n.next = head;
        if (head != null) head.prev = n;
        head = n;
        if (tail == null) tail = n;
    }

    void addLast(String data) {
        Node n = new Node(data);
        n.prev = tail;
        if (tail != null) tail.next = n;
        tail = n;
        if (head == null) head = n;
    }

    String removeFirst() {
        if (head == null) return null;
        String d = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        return d;
    }

    String removeLast() {
        if (tail == null) return null;
        String d = tail.data;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        return d;
    }

    String peekFirst() { return head != null ? head.data : null; }
    String peekLast()  { return tail != null ? tail.data : null; }
}
