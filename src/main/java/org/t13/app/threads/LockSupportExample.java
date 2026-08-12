package org.t13.app.threads;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class LockSupportExample {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        // Thread references so they can unpark each other
        Thread[] threads = new Thread[2];

        threads[0] = new Thread(() -> {
            while (counter.get() < 10) {
                // Only run when counter is even
                if (counter.get() % 2 == 0) {
                    System.out.println("Thread PrinterThread1 is printing: " + counter.incrementAndGet());
                    LockSupport.unpark(threads[1]); // wake up Thread2
                    LockSupport.park();             // pause until Thread2 wakes us
                }
            }
        }, "PrinterThread1");

        threads[1] = new Thread(() -> {
            while (counter.get() < 10) {
                // Only run when counter is odd
                if (counter.get() % 2 == 1) {
                    System.out.println("Thread PrinterThread2 is printing: " + counter.incrementAndGet());
                    LockSupport.unpark(threads[0]); // wake up Thread1
                    LockSupport.park();             // pause until Thread1 wakes us
                }
            }
        }, "PrinterThread2");

        threads[0].start();
        threads[1].start();

        threads[0].join();
        threads[1].join();

        System.out.println("Thread has finished");
    }
}
