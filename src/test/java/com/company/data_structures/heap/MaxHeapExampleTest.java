package com.company.data_structures.heap;

import java.util.ArrayList;

public class MaxHeapExampleTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = arrayList.size();

        Heap heap = new Heap();
        heap.insert(arrayList, 3);
        heap.insert(arrayList, 4);
        heap.insert(arrayList, 9);
        heap.insert(arrayList, 5);
        heap.insert(arrayList, 2);

        System.out.println("Max-Heap array: ");
        heap.printArray(arrayList, size);

        heap.deleteNode(arrayList, 4);
        System.out.println("After deleting an element: ");
        heap.printArray(arrayList, size);
    }
}
