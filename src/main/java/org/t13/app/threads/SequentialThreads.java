package org.t13.app.threads;



public class SequentialThreads {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> printer.print(1), "Thread-1");
        Thread t2 = new Thread(() -> printer.print(2), "Thread-2");
        Thread t3 = new Thread(() -> printer.print(3), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
