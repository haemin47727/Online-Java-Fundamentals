package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, ead back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */
public class Exercise_02 {
    public static void main(String[] args) {
        int character = 0;
        File read = new File("src/labs_examples/input_output/files/char_data.txt");
        File write = new File("src/labs_examples/input_output/files/Exercise2write");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(read));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(write))) {

            while ((character = bufferedReader.read()) != -1) {
                char c = (char) character;
                if (c == 'a') {
                    bufferedWriter.write('-');
                } else if (c == 'e') {
                    bufferedWriter.write('~');
                } else bufferedWriter.write(c);
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        }
        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(write))) {
            String line;
            System.out.println("\nencrypted:\n");
            while ((line = bufferedReader2.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        }
        try (BufferedReader bufferedReader3 = new BufferedReader ( new FileReader(write))){
            System.out.println("\ndecrypted:\n");
            while ((character = bufferedReader3.read()) != -1){
                char c = (char) character;
                if (c == '-') {
                    System.out.print('a');
                } else if (c == '~') {
                    System.out.print('e');
                } else
                    System.out.print(c);
            }
        } catch (IOException exc1) {
            exc1.printStackTrace();
        }

    }
}
