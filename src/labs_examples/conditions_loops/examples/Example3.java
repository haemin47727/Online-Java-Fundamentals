package labs_examples.conditions_loops.examples;

// Guess the letter game, 2nd version.
class Guess2 {
    public static void main(String args[])
          throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // get a char

        if(ch == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you're wrong.");
    }
}