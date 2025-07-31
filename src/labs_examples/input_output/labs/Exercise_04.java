package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
public class Exercise_04{
    public static void main(String[] args){
        ArrayList<Student> arraylist = new ArrayList<>();
        String line;
        Student student;
        File csv = new File("src/labs_examples/input_output/labs/Csv.csv");
        File csvWrite = new File("src/labs_examples/input_output/labs/WriteCsv.csv");
        try(BufferedReader read = new BufferedReader (new FileReader(csv));
            BufferedWriter write = new BufferedWriter (new FileWriter(csvWrite))){
            while((line = read.readLine()) != null) {
                String[] each = line.split(",");
                arraylist.add(parsedStudent(each));
            }
            for(Student a : arraylist){
                System.out.println(a);
                write.write(a.toString()+"\n");
            }



        } catch (IOException exc){
            exc.printStackTrace();
        }

    }

    public static Student parsedStudent(String[] each) {
        Student student = new Student();
        student.setFirstName(each[0]);
        student.setLastName(each[1]);
        student.setAge(Integer.parseInt(each[2]));
        student.setGrade(each[3]);
        return student;
    }
}