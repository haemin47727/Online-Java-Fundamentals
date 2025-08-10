package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
public class Exercise_04{
    public static void main(String [] args) {
        Synchronizing shared = new Synchronizing();
    Thread thread1 = new Thread(shared , "thread1");
    Thread thread2 = new Thread(shared , "thread2");
    thread1.start();
    thread2.start();
    }
}

class Synchronizing implements Runnable {
    static int counter = 0;
    static Object block = new Object();
    @Override
    public void run(){
        syncExample(Thread.currentThread().getName());
    }
    synchronized void syncExample(String name){
        for(int i = 0 ; i < 6 ; i++){
            System.out.println(name + " " + i);
            try{
                Thread.sleep(400);
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }
            synchronized (block) {
                counter ++;
                System.out.println("total ran for " + counter);
        }

        }
    }

}