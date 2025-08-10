package labs_examples.multi_threading.labs;



/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


public class Exercise_01 {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Threading("thread1"));
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        new Thread(new Threading ("thread2")).start();
    }

    public static class Threading implements Runnable {
        String name;
        public Threading(String name){
            this.name = name;
        }
        @Override
        public void run(){

                for(int i = 0 ; i < 10 ; i++){
                    System.out.println(name + " ran " + i + " number of times");
                    try {
                        Thread.sleep(400);
                    } catch(InterruptedException exc){
                        exc.printStackTrace();
                    }
                }
            }
        }
    }
