package org.t13.app.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class heap {

    static void main() {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                Comparator.reverseOrder()
        );

        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(0);
        maxHeap.add(8);

        System.out.println("MaxHeap : " + maxHeap.peek());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(1);
        minHeap.add(2);
        minHeap.add(3);
        minHeap.add(0);

        System.out.println("MinHeap : " + minHeap.peek());

        PriorityQueue<String> strHeap = new PriorityQueue<>(Comparator.reverseOrder());

        strHeap.add("apple");
        strHeap.add("orange");
        strHeap.add("pear");

        System.out.println("StrHeap : " + strHeap.peek());

        PriorityQueue<CharFrequency> cfHeap = new PriorityQueue<>(
                (a,b) -> {
                   int compare =  b.freq - a.freq;
                   if (compare == 0) {
                       return a.str.compareTo(b.str);
                   }
                   return compare;
                }
        );

        cfHeap.add(new CharFrequency(1, "orange"));
        cfHeap.add(new CharFrequency(2, "banana"));
        cfHeap.add(new CharFrequency(2, "zzzeba"));
        cfHeap.add(new CharFrequency(1, "apple"));


        System.out.println("CFHeap : " + cfHeap.peek().toString());


    }
}


