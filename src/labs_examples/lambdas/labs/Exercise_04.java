package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * // *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * // *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 * // *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * // *          to get the sum of the modified list
 * // *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * // *          function to average the remaining numbers, assign this result to an int variable.
 * // *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * <p>
 * 6) Demonstrate how to Stream a text file and print out each line
 * <p>
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * then print out the element at the 1 index for each array.
 * <p>
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * then print out the sum of all elements at index 2.
 * <p>
 * 9) Demonstrate the anyMatch() function.
 * <p>
 * 10) Demonstrate the allMatch() function.
 * <p>
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List
 */
class Example {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 15).forEach(System.out::println);
        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println("the sum is " + sum);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 20, 50);
        int mapSum = list.stream().mapToInt((Integer n) -> n + 1).sum();
        System.out.println("Sum of altered numbers is " + mapSum);
        int filtered = (int) list.stream().filter(n -> n >= 10).mapToInt(n -> n).average().orElse(0);
        System.out.println("Sum of filtered numbers is " + filtered);
        int reduceSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all numbers before changing is " + reduceSum);
        Path path = Path.of("src/labs_examples/lambdas/labs/stream_text_lab.csv");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<String> lines = Files.lines(path)) {
            lines.map(line -> line.split(",")).filter(line -> line.length > 1).
                    forEach(array -> System.out.println("word at index of 1 at each array: " + array[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<String> lines = Files.lines(path)) {
            double sumDouble = lines.map(line -> line.split(",")).filter(line -> line.length > 2).
                    mapToDouble(line -> Double.parseDouble(line[2])).sum();
            System.out.println("sum in double at index of 2 is " + sumDouble);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<String> lines = Files.lines(path)) {
            boolean hasThree = lines.map(line -> line.split(",")).anyMatch(array -> array[0].contains("3"));
            System.out.println("have 3? " + hasThree);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<String> lines = Files.lines(path)) {
            boolean allHaveThreeColumns = lines
                    .map(line -> line.split(","))
                    .allMatch(array -> array.length >= 3);
            System.out.println(allHaveThreeColumns);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<String> lines = Files.lines(path)) {
            List<String> indexOneValues = lines
                    .map(line -> line.split(","))
                    .filter(array -> array.length > 1)
                    .map(array -> array[1])
                    .collect(Collectors.toList());
            System.out.println("Values at index 1:");
            indexOneValues.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
