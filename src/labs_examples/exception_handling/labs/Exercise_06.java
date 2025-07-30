package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 * <p>
 * Demonstrate throwing an exception in one method and catching it in another method.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 7, 8};
        int sum = 0;
        try {
            sum = method1(array);
            System.out.println("sum is " + sum);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("exception");
        }
    }

    public static int method1(int[] array) throws ArrayIndexOutOfBoundsException {
        int i;
        int sum = 0;
        for (i = 0; i <= array.length; i++) {
            System.out.println(sum = array[i] + array[i + 1]);
            sum += array[i];
        }

        return sum;
    }
}
