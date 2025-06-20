package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        int age = 43;
        String name = "Ryan";

        System.out.println(name + " is " + age + " years old.");

        // byte,short,int,long,float,double,boolean,char
        // declare : byte b, initialize by having =
        byte a = 2;
        System.out.println(a);
        short b = 1500;
        System.out.println("Short is " + b);
        long temperature = 6500;
        System.out.println("The temperature is " + temperature + " Fahrenheit.");
        float pi = 3.14F;
        System.out.println("Apple " + pi + " is yummy");
        double c = 590.5;
        System.out.println("Dobule is " + c );


        char beef = 'F';
        System.out.println("The grade is " + beef);
        boolean Nightlight = false;
        System.out.println(Nightlight);
        boolean isDaylight = false;
        System.out.println(isDaylight);
        if (!Nightlight) {
            System.out.println("Turn off the lights!");
        }
    }

}
