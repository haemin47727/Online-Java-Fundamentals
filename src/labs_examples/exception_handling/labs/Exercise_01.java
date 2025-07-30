package labs_examples.exception_handling.labs;

///**
// * Exception Handling Exercise 1:
// *
// *      1) Demonstrate a try/catch.
// *
// */

import java.io.FileReader;
import java.io.IOException;

class Exercise1{
    public static void main(String[] args){
        int character;
        try (FileReader file = new FileReader("src/labs_examples/exception_handling/labs/Exercise_02.java"))
        { while((character = file.read()) != -1){
            System.out.print((char) character);
        } }
        catch (IOException e) {
            System.out.println("error");

        }

    }
}

