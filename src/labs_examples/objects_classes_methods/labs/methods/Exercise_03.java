package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
       int x = factorial(5);
       System.out.println(x);

    }


    public static int factorial(int a){

        if( a > 1 ) {
            int x = a * factorial(a - 1);
            return x;
        } else {
            return 1;
        }
        }
    }







