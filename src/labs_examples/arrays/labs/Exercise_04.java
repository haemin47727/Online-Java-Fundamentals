package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
public static void main(String[] args){
    int[][] irregular = { { 5, 4, 3, 2 } , {3, 2, 1} , {8, 9, 4, 2} };
    for(int[]a : irregular){
        for(int b : a) {
            System.out.print(b + "\t");
        } System.out.println();
    }


}
}
