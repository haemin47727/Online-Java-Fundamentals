package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        // write completed here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number from 1 to 7:");
        int number = scanner.nextInt();
//        if (number < 8 && number >0 ) {
//            if (number < 7 && number >0) {
//                if (number < 6 && number >0) {
//                    if (number < 5 && number >0) {
//                        if (number < 4 && number >0) {
//                            if (number < 3 && number >0) {
//                                if (number < 2 && number >0) {
//
//                                        System.out.println("The day is Saturday"); return;
//                                    }
//                                    System.out.println("The day is Friday"); return;
//
//                                }
//                                System.out.println("The day is Thursday"); return;
//                            }
//                            System.out.println("The day is Wed"); return;
//                        }
//                        System.out.println("The day is Tues"); return;
//                    }
//                    System.out.println("The day is Mon"); return;
//                }
//                System.out.println("The day is Sun"); return;
//            } else System.out.println("Other"); return;
//        }
        if(number < 1 || number > 7){
            System.out.println("other");

        } else if (number > 1) {
            if (number > 2) {
                if (number > 3) {

                } else {
                    System.out.println("Wednesday");
                }
            } else {
                System.out.println("Tuesday");
            }
        } else {
            System.out.println("Monday");
        }
        System.out.println("test");
    } //continue, break are only for loop. return exits the whole method (main method)
}

    /*
    if(number == 1) {
        System.out.println("It's Monday");
    }
    else if(number == 2) {
        System.out.println("It's Tuesday");
    }
    else if(number ==3) {
        System.out.println("It's Wednesday");
    }
    else if (number ==4) {
        System.out.println("It's Thursday");
    }
    else if (number == 5 ) {
        System.out.println("It's Friday");
    }
    else if (number == 6) {
        System.out.println("It's Saturday");
    }
    else if ( number == 7 ) {
        System.out.println("It's Sunday");
    } else System.out.println("Other");
    }

    }
*/
