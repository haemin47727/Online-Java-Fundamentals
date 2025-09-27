package labs_examples.datastructures.queue.labs;

/**
 * Queues - Exercise_02
 * <p>
 * Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 * rather than the LinkedList as in the example we have already seen.
 * <p>
 * Your custom Queue class must also do the following:
 * <p>
 * 1) throw a custom exception when trying to pop  an element from an empty Queue
 * 2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 * 3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 * 4) contain the methods peekFirst() and peekLast()
 * 5) contain a size() method
 * 6) contain a method to print out the data of all elements in the Queue
 */

class MyEmptyQueueException extends RuntimeException {
    public MyEmptyQueueException(String message) {
        super(message);
    }
}


public class Exercise_02<T> {
    private T[] items;
    private int front;
    private int rear;
    private int size;


    public Exercise_02() {
        items = (T[]) new Object[4];
        front = 0;
        rear = 0;
        size = 0;
    }


    public void add(T value) {
        if (size >= items.length * 3 / 4) {
            grow();
        }

        items[rear] = value;
        rear = (rear + 1) % items.length;
        size++;
    }


    public T remove() {
        if (size == 0) {
            throw new MyEmptyQueueException("Queue is empty!");
        }

        T value = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        size--;

        if (size > 0 && size <= items.length / 4) {
            shrink();
        }
        return value;
    }


    public T peekFirst() {
        if (size == 0) {
            throw new MyEmptyQueueException("Queue is empty!");
        }
        return items[front];
    }

    public T peekLast() {
        if (size == 0) {
            throw new MyEmptyQueueException("Queue is empty!");
        }
        int lastIndex = (rear - 1 + items.length) % items.length;
        return items[lastIndex];
    }

    public int getSize() {
        return size;
    }


    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % items.length;
            System.out.print(items[index] + " ");
        }
        System.out.println();
    }


    private void grow() {
        resize(items.length * 2);
    }


    private void shrink() {
        resize(items.length / 2);
    }


    private void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[(front + i) % items.length];
        }
        items = newArray;
        front = 0;
        rear = size;
    }
}