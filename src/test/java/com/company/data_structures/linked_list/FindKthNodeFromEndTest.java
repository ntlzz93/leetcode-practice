package com.company.data_structures.linked_list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindKthNodeFromEndTest {

    @Test
    public void findKthNodeFromEndTest() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        int result = myLinkedList.findKthFromEnd(k).getValue();
        assertEquals(4, result);
    }
}
