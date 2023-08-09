package com.company.data_structures.linked_list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMiddleNodeTest {
    @Test
    public void returnMiddleNode() {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        assertEquals(3, linkedList.findMiddleNode().getValue());
    }
}
