package com.company.problems.problem203;

import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for(int num :nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargest obj = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(obj.add(3));  // trả về 4
        System.out.println(obj.add(5));  // trả về 5
        System.out.println(obj.add(10)); // trả về 5
        System.out.println(obj.add(9));  // trả về 8
        System.out.println(obj.add(4));  // trả về 8
    }
}
