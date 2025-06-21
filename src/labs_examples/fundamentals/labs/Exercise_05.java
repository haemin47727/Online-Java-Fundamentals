package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        String str2 = "hello";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();
        System.out.println("The length of the string is " + strLength);

        // please initialize a boolean variable and test whether str is equal to str2
        boolean equalStrings = str.equals(str2);
        System.out.println("Is string 1 equal to string 2? " + equalStrings);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str2.concat(" ").concat(str);
        System.out.println(str3);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

    }


}