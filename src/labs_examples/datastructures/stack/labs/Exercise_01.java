package labs_examples.datastructures.stack.labs;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */
import java.util.Stack;

public class Exercise_01 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();


        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");
        System.out.println("Stack after pushes: " + stack);


        String top = stack.peek();
        System.out.println("Top item : " + top);
        System.out.println("Stack after peek : " + stack);


        String popped = stack.pop();
        System.out.println("Popped item: " + popped);
        System.out.println("Stack after pop: " + stack);


        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);


        int position = stack.search("apple");
        System.out.println("Position of apple from the top: " + position);


        int notFound = stack.search("durian");
        System.out.println("Position of durian from the top: " + notFound);
    }
}
