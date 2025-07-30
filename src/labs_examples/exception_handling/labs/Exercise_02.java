package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
public class Exercise_02{
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 0;
        try {
            int d = division(a , c);
            int e = division(b , a);
            System.out.println(d + " " + e);
        } catch (ArithmeticException e){
            System.out.println("Math error");
        }
          catch (Exception e){
              System.out.println("error");
          }
    }
    public static int division(int a , int b){
        return a / b;
    }
}

