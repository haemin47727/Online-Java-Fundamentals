package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String numbz= "123";
        int c = Integer.parseInt(numbz);//converting string to integer. Capitalize first letter. Integer is object.
        System.out.println("Gimme two numbs");
//        int numb = scanner.nextInt();
//        int numb_2 = scanner.nextInt();
        String numbers = scanner.nextLine();
        String[] array = numbers.split(" ");
        int numb = Integer.parseInt(array[0]); //.parse
        int numb_2 = Integer.parseInt(array[1]);
        int sum = 0;
        int count = 0;

        for(;numb <= numb_2; numb++){
            sum += numb;
            System.out.println("The sum is " + sum);
            count++;
        }
        System.out.println("The final sum is "+ sum);
        double average = (double) sum/count;
        System.out.println("Average is " + average );}}


