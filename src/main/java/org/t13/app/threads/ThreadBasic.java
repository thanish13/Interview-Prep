package org.t13.app.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadBasic {

    static void main() throws InterruptedException {

        Printer printer = new Printer();

        Thread thread1 = new Thread(printer, "PrinterThread1");
        Thread thread2 = new Thread(printer, "PrinterThread2");


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.out.println("Thread has finished");
    }

    static class Printer implements Runnable{
        int i = 0;

        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " is printing: " + ++i);
        }
    }
}
