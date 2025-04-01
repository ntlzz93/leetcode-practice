package com.company.data_structures.tree_base_dsa;

public class Node {
    int item, height;
    Node left, right;

    public Node(int item) {
        this.item = item;
        this.height = 1;
        left = right = null;
    }
}
