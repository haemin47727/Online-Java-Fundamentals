package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {
    public static void main(String[] args){

    try {
        System.out.println(myMethod());
    } catch (CustomException custom){
        System.out.println(" custom exception caught ");
    }
    }

    static String myMethod() throws CustomException {
        CustomException x = new CustomException();
        return x.toString();
    }

    static class CustomException extends Exception {
        @Override
        public String toString(){
            return "Custom Exception";
        }
    }
}