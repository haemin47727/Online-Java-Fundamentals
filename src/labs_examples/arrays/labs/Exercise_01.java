package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 10 numbers");
        int[] a = new int[10];
        int sum = 0 ;
        int average = 0;
        for(int b = 0; b < a.length; b++){
            int input = scanner.nextInt();
            a[b] = input;
            sum = sum + input;
            average = sum / a.length;
        }
        System.out.println(sum + " " + average);





        }



    }
