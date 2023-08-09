package com.company.data_structures.linked_list;

import com.company.data_structures.Node;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }
    /*Floyd's Tortoise and Hare algorithm*/
    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
    /*Floyd's Tortoise and Hare algorithm*/
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) return true;
        }
        return false;
    }
}
