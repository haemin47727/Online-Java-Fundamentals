package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 3: My First Program
 *
 *      Write the necessary code to display the follow message to the console
 *
 *      Hello World!
 *      Check out my first program!
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // write code to print out "Check out my first Java program!" below
        System.out.println("Check out my first java program");

        int i = 10;
        if (i == 5) {
            System.out.println("i=5");
        } else if (i == 10) {
            System.out.println("i=10");
        } else if (i == 15) {
            System.out.println("i=15");
        }

        int a = 5;
        long l = a; // widening conversion implicit

        double t = 5.5;
        int b = (int) t; // narrowing conversion must cast explicitly
        System.out.println(b);
    }

}
