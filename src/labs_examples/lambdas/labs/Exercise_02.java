package labs_examples.lambdas.labs;
import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.Supplier;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntFunction;
import java.util.function.ToIntBiFunction;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02{
    public static void main (String[] args){
        UnaryOperator<Integer> unaryOperator = (Integer a) ->
            a * 2;
        double unary =  unaryOperator.apply(5).doubleValue();
        System.out.println(unary);

        BinaryOperator<Integer> binaryOperator = (Integer a , Integer b) -> a + b;
        Integer binary = binaryOperator.apply(2 , 3);
        System.out.println(binary);
        Comparator<Integer> comparator = Integer :: compare;
        BinaryOperator<Integer> bigger = BinaryOperator.maxBy(comparator);
        Integer max = bigger.apply(10, 8);
        System.out.println("bigger number is " + max);

        Predicate <String> predicate = (String a) -> {return a.length() < 11;};
        boolean lengthLimit = predicate.test("Phenomenal");
        System.out.println("Is the length less than 11? " + lengthLimit);

        DoublePredicate doublePredicate = (value) -> {return value > 10;};
        boolean valueLimit = doublePredicate.test(3.142);
        System.out.println("Is value more than 10? " + valueLimit);

        DoubleUnaryOperator doubleUnaryOperator = (value) -> {return value * 2;};
        double unaryDouble = doubleUnaryOperator.applyAsDouble(4.444);
        System.out.println("Double the value is " + unaryDouble);

        IntToDoubleFunction intToDoubleFunction = (int value) -> {return value * 3.14;};
        double conversion = intToDoubleFunction.applyAsDouble(5);
        System.out.println("double value is " + conversion);
        Supplier<String> supplier = () -> {
            return "supplier hello";
        };
        String supply = supplier.get();
        System.out.println(supply);
        ObjIntConsumer<String> objIntConsumer = (String a , int value) -> {
            System.out.println("Hello Mr/Ms " + a + " of age " + value);
        };
        objIntConsumer.accept("John" , 30);
        ToIntFunction<String> toIntFunction = (String name) -> {return name.length();};
        int id = toIntFunction.applyAsInt("Seraphine");
        System.out.println(id);

        ToIntBiFunction<Double, Long> toIntBiFunction = (Double a, Long b) -> a.intValue() + b.intValue();
        int toInt = toIntBiFunction.applyAsInt(10.325, 300L);
        System.out.println(toInt);
    }
}