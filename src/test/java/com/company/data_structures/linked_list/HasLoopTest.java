package com.company.data_structures.linked_list;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HasLoopTest {

    @Test
    public void hasLoop() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().setNext(myLinkedList.getHead());
        assertTrue(myLinkedList.hasLoop());
    }
}
