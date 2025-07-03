package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args){
        int a = 0;
        for(a = 0; a < 101; a++){
            if(a > 50) {
                break;
            }
            System.out.println(" a is " +a);


        }
    }
}
