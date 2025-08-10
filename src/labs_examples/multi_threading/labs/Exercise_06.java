package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 * <p>
 * Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 * print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    public static void main(String[] args) {
        Sequential sequential = new Sequential();
        Thread thread1 = new Thread(sequential, "thread1");
        Thread thread2 = new Thread(sequential, "thread2");
        thread1.start();
        thread2.start();
    }
}

class Sequential implements Runnable {
    int counter = 1;

    @Override
    public void run() {
        loop(Thread.currentThread().getName());
    }

    public synchronized void loop(String name) {
        while (counter < 101) {
            if ((counter % 2 == 1 && name.equals("thread1")) || (counter % 2 == 0) && name.equals("thread2")) {
                System.out.println(counter);
                counter++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException exc) {
                    exc.printStackTrace();
                }
            }
        }
    }
}