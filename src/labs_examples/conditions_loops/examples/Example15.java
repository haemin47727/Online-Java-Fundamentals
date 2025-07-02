package labs_examples.conditions_loops.examples;

// Loop until an S is typed.
class ForTest {
   public static void main(String args[])
            throws java.io.IOException {

        int i;

        System.out.println("Press S to stop.");

        // char userInput = (char) System.in.read();
       // 128 64 32 16 8 4 2 1

       // 0111 1101
       // 00000000
       // 11111111

       // System.out.println(System.in.read());


        for(i = 0; System.in.read() != 'S' ; i++)
            System.out.println("Pass #" + i);
    }
//    public static void main(String[] args){
//        int counter = 0;
//        while(counter <= 100) {
//            if(counter == 0)
//            { counter ++; continue; } System.out.println("counter is " + counter);
//        counter++;
//        }
//
//    }//control /
}