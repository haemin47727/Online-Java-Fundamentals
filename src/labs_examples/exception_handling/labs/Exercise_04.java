package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 4:
 * <p>
 * Demonstrate a nested try/catch.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 7};
        try {
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                try {
                    System.out.println(String.format("%.1f", (float) array[i] / i));
                } catch (ArithmeticException arth) {
                    System.out.println("arithmetic");
                }
            }
        } catch (Exception x) {
            System.out.println("exception");
        }
    }
}