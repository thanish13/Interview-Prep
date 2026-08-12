package org.t13.app.threads;

class Printer {
    private int number = 1;        // start from 1
    private int turn = 1;          // Thread-1 starts

    public synchronized void print(int threadId) {
        while (number <= 10) {
            while (turn != threadId) {
                try {
                    wait();        // wait until it's this thread's turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number <= 10) {
                System.out.println("Thread-" + threadId + " prints: " + number);
                number++;
                turn = (turn % 3) + 1; // switch turn: 1→2→3→1
                notify();           // wake up other threads
            }
        }
    }
}