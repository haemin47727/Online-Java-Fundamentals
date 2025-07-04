package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int start =3;
        for(int a = 0; a < matrix.length; a++){
            for(int b = 0; b < matrix[a].length; b++){
                matrix[a][b] = start;
                start += 3;
                System.out.print(matrix[a][b] + "\t");
            } System.out.println();
        }
    }
}
