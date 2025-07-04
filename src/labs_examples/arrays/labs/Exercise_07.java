package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
public static void main(String[] args){
    ArrayList<String> a = new ArrayList<String>();
    a.add("Apple");
    a.add("Went");
    a.add("Bad");
    for(int i = 0 ; i < a.size() ; i++){
        System.out.println("Element at " + i + " is " + a.get(i));
    }
}
}

