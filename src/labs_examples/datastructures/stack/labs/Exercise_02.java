package labs_examples.datastructures.stack.labs;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize a new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */


class MyEmptyStackException extends RuntimeException {
    public MyEmptyStackException(String message) {
        super(message);
    }
}


class Exercise<T> {
    private T[] stackArray;
    private int count;


    public Exercise() {
        stackArray = (T[]) new Object[4];
        count = 0;
    }


    public void push(T item) {
        if (count >= stackArray.length * 3 / 4) {
            resize(stackArray.length * 2);
        }
        stackArray[count] = item;
        count++;
    }


    public T pop() {
        if (count == 0) {
            throw new MyEmptyStackException("Stack is empty!");
        }

        T item = stackArray[count - 1];
        stackArray[count - 1] = null; // clean up
        count--;

        if (count > 0 && count <= stackArray.length / 4) {
            resize(stackArray.length / 2); // shrink if mostly empty
        }

        return item;
    }


    public T peekFirst() {
        if (count == 0) {
            throw new MyEmptyStackException("Stack is empty!");
        }
        return stackArray[0];
    }


    public T peekLast() {
        if (count == 0) {
            throw new MyEmptyStackException("Stack is empty!");
        }
        return stackArray[count - 1];
    }


    public int size() {
        return count;
    }


    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i < count; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }


    private void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < count; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }
}
public class Exercise_02 {
    public static void main(String[] args) {
        Exercise<String> stack = new Exercise<>();

        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");
        stack.push("durian");

        stack.printStack();

        System.out.println("First item: " + stack.peekFirst());
        System.out.println("Last item: " + stack.peekLast());

        stack.pop();
        stack.pop();

        stack.printStack();
        System.out.println("Size: " + stack.size());
    }
}