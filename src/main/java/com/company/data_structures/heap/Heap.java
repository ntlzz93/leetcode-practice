package com.company.data_structures.heap;

import java.util.ArrayList;

public class Heap {

    /*
    * Heapify(array, size, i)
      set i as largest
      leftChild = 2i + 1
      rightChild = 2i + 2

      if leftChild > array[largest]
        set leftChildIndex as largest
      if rightChild > array[largest]
        set rightChildIndex as largest

      swap array[i] and array[largest]
    * */
    public void heapIfy(ArrayList<Integer> ht, int i) {
        int size = ht.size();
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if (left < size && ht.get(left) > ht.get(largest)) {
            largest = left;
        }
        if (right < size && ht.get(right) > ht.get(largest)) {
            largest = right;
        }
        if(largest != i) {
            int temp = ht.get(largest);
            ht.set(largest, ht.get(i));
            ht.set(i, temp);
            heapIfy(ht,largest);
        }
    }
    /*
    * Algorithm for insertion in Max Heap

        If there is no node,
          create a newNode.
        else (a node is already present)
          insert the newNode at the end (last node from left to right.)

        heapify the array
     * */
    public void insert(ArrayList<Integer> ht, int newNum) {
        int size = ht.size();
        if(size == 0) {
            ht.add(newNum);
        }else {
            ht.add(newNum);
            for(int i = size / 2 -1; i>=0; i--) {
                heapIfy(ht,i);
            }
        }
    }

    /*
    * If nodeToBeDeleted is the leafNode
      remove the node
    Else swap nodeToBeDeleted with the lastLeafNode
      remove noteToBeDeleted

    heapify the array
    * */
    public void deleteNode(ArrayList<Integer> ht, int num) {
        int size = ht.size();
        int i;
        for(i =0;i<size;i++) {
            if (num == ht.get(i)) {
                break;
            }
        }
        int temp = ht.get(i);
        ht.set(i, ht.get(size-1));
        ht.set(size-1, temp);
        ht.remove(size-1);
        for(int j = size / 2 -1; j>=0; j--) {
            heapIfy(ht,j);
        }
    }

    public void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
