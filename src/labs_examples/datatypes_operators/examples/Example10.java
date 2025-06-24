package labs_examples.datatypes_operators.examples;

/*
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/

/*
complies but enters infinite for loop because
count keeps getting reset to 0

Update- does not compile when i is reinitialized
*/
class NestVar {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;


        for(int i = 1; i < row; i = i+1) {
            System.out.println("This will print once per i loop");

            for(int j = 1; j < col; j++) {
                //System.out.print("This will print once per j loop");
                System.out.print("[" + i + "," + j + "]");
                // System.out.println();
            }

             System.out.println("demo");
        }
    }
}
