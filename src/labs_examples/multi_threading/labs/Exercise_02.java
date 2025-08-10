package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
public class Exercise_02 {
    public static void main(String[] args){
        Threading thread1 = new Threading ("thread1");
    }
    public static class Threading extends Thread {
        public Threading(String name){
            super(name);
            this.start();
        }

        @Override
        public void run(){
            for(int i = 0 ; i < 6 ; i++){
                System.out.println(currentThread().getName() + "ran for " + i + " many times");
                try{
                    Thread.sleep(400);
                } catch (InterruptedException exc){
                    exc.printStackTrace();
                }
            }
        }

    }
}