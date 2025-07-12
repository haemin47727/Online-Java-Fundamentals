package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int multiply = multiply(5, 10);
        System.out.println("multiplication is " + multiply);

        int divide = divide(10, 5);
        System.out.println("Division is " + divide);

        joke("Crown a King");

        int seconds = seconds(5);
        System.out.println("In seconds 5 years are " + seconds);

        int varag = varar("Potato", "Pen");
        System.out.println(varag);
    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b) {
        return (a * b);
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b) {
        return (a / b);
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void joke(String a) {
        System.out.println("The joke is " + a);

    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int seconds(int a) {
        return (a * 31536000);
    }

        // 5) Create a varargs method that will return the length of the varargs array passed in
    static int varar(String...a){
        return a.length;
        }
    }






