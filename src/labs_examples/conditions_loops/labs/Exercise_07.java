package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = scanner.nextLine();
        int i = 0;
        while (i < word.length()) {
            char alphabet = word.charAt(i);
            i++; System.out.println(alphabet);
            if ("aeiou".indexOf(alphabet) != -1) {
                System.out.println("The vowel is " + alphabet +" in your word, \"" + word + "\"");
            }
        }

    }
}
