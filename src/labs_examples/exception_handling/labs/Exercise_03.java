package labs_examples.exception_handling.labs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
public class Exercise_03{
    public static void main(String[] args){
        FileReader read = null;
        int c;
        File a = new File("src/labs_examples/exception_handling/labs/Exercise_04.java");
        try {
            read = new FileReader(a);
            while((c = read.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e){
            System.out.println("IO Exception");
        }
        finally {
            try {
                if(read != null){
                read.close();}
                System.out.println("closed");
            } catch (Exception x){
                System.out.println("cannot close");
            }
        }
    }
}