package com.company.data_structures.heap.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);

        System.out.println(minHeap.peek());
        minHeap.poll();
        System.out.println(minHeap.peek());
        minHeap.poll();
        System.out.println(minHeap.peek());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(30);

        System.out.println(maxHeap.peek());
        maxHeap.poll();
        System.out.println(maxHeap.peek());
        maxHeap.poll();
        System.out.println(maxHeap.peek());
    }
}
