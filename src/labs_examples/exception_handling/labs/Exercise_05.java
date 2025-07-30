package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */

class Example {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Arithmetic");
        } catch (ArithmeticException e) {
            System.out.println("exception caught");
            e.printStackTrace();
        }
    }

}