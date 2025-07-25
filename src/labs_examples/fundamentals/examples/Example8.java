package labs_examples.fundamentals.examples;

/*

   This program displays a conversion
   table of gallons to liters.

   Call this program "GalToLitTable.java".
*/
class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " +
                    liters + " liters.");

            counter++;
            System.out.println("The counter is " + counter);
            // every 10th line, print a blank line

            // counter is not 10, so gallons ++ happens here

            // counter == 10

            if (counter == 10) {

                System.out.println();
                counter = 0; // reset the line counter
            }


        // On if the counter is 10 other code is completed, now gallons is ++

        }
    }
}