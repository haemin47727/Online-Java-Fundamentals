package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class Exercise_05{
    public static void main (String [] args) {
        Example example = new Example();
        Thread thread1 = new Thread(example, "thread1");
        Thread thread2 = new Thread(example, "thread2");
        thread2.start();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        thread1.start();
    }
}

class Example implements Runnable {
    @Override
    public void run(){
        syncExample(Thread.currentThread().getName());
    }
    public synchronized void syncExample(String object) {
        if(object.equals("thread2")) {
            try {
                wait();
            } catch (InterruptedException e ){
                e.printStackTrace();
            }
            System.out.println("resuming thread 2");
            for (int i = 0 ; i < 5 ; i ++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = 0 ; i < 5 ; i ++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            try{
                Thread.sleep(400);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            }
            System.out.println("notifying");
            notify();
        }
    }
}