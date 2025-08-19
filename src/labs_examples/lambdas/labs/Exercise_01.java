package labs_examples.lambdas.labs;
import java.util.function.BiFunction;
import java.util.function.Consumer;
/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 **/

@FunctionalInterface
interface FunctionalInterface1{
    public abstract void method1();
}
@FunctionalInterface
interface FunctionalInterface2{
    public abstract int method2(int a);
}
@FunctionalInterface
interface FunctionalInterface3{
    public abstract boolean method3(String a , int b);
}
public class Exercise_01{
    public static void main (String [] args) {
        FunctionalInterface1 functionalInterface1 = () -> {
            System.out.println("Functional Interface lambda expression 1");
        };

        FunctionalInterface2 functionalInterface2 = (int a) -> {return (a * a); };
        int z = functionalInterface2.method2(5);
        System.out.println(z);

        FunctionalInterface3 functionalInterface3 = (String a , int b) -> {return a.length() > 5 && b > 10;};
        boolean lambda3 = functionalInterface3.method3("Stephanie" , 35);
        System.out.println(lambda3);
        boolean lambda3sub = functionalInterface3.method3("David" , 5);
        System.out.println(lambda3sub);

        BiFunction<Integer, Integer, Boolean> biFunction = (a , b) ->  a < 10 && b < 10;
        boolean biFunctionTrue = biFunction.apply(5 , 15);
        System.out.println("Testing BiFuction and the result is " + biFunctionTrue);
        Consumer<String> welcome = (String name) -> {
            System.out.println("Welcome " + name);
        };
        Consumer<String> goodBye = (name) -> {
            System.out.println("Good bye " + name);
        };
        Consumer<String> greetings = welcome.andThen(goodBye);
        greetings.accept("James");
        greetings.accept("John");

        FunctionalInterface1 anonymous1 = new FunctionalInterface1(){
            @Override
            public void method1(){
                System.out.println("Functional Interface anonymous inner class 1");
            }
        };
        anonymous1.method1();

        FunctionalInterface2 anonymous2 = new FunctionalInterface2(){
            @Override
            public int method2(int a){
                System.out.println("Functional Interface anonymous inner class 2");
                return a * 2;
            }
        };
        int x = anonymous2.method2(5);
        System.out.println(x);

        FunctionalInterface3 anonymous3 = new FunctionalInterface3(){
            @Override
            public boolean method3(String a , int b){
                return a.length() < 6 && b < 11;
            }
        };
        boolean trueOrFalse = anonymous3.method3("David" , 5);
        System.out.println(trueOrFalse);

    }

}

