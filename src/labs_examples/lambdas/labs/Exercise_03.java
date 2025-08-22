package labs_examples.lambdas.labs;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

public class Exercise_03{
    public static void main(String [] args){
        Function<String, Integer> stringToInt = Integer::parseInt;
        int transformed = stringToInt.apply("50");
        System.out.println(transformed);

        String greeting = "hello";
        Supplier<String> supplier = greeting::toUpperCase;
        System.out.println(supplier.get());

        Supplier<Dish> dishSupplier = Dish::new;
        Dish dish = dishSupplier.get();
    }

}
class Dish {
    public Dish() {
        System.out.println("dish created");
    }
}