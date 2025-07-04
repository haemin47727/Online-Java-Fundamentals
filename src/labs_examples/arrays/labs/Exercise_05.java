package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
public static void main(String[] args){
    String[] a = new String[5];
    a [0] = "apple";
    a [1] = "banana";
    a [2] = "watermelon";
    a [3] = "durian";
    a [4] = "mangosteen";
    for(int i = a.length-1; i >= 0; i--){
        System.out.print(a[i] + "\t");
    }
}
}
