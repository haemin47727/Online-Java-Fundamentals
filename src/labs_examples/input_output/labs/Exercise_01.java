package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        File input = new File("src/labs_examples/input_output/files/byte_data");
        File output = new File("src/labs_examples/input_output/files/Exercise1fileWrite");
    try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(input));
         BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(output));
        ) {
        byte[] buffer = new byte[5];
        int numberOfBytesRead = 0;
        while ((numberOfBytesRead = bufferedInputStream.read(buffer)) != -1) {
            System.out.print(new String ( buffer , 0 , numberOfBytesRead));
            bufferedOutputStream.write(buffer, 0 , numberOfBytesRead);
        }

    } catch(IOException exc){
        exc.printStackTrace();
    }
    }
}