package com.company.data_structures.tree_base_dsa;

public class BinarySearchTree {

    Node root;

    public Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.item) root.left = insert(root.left, value);
        else if (value > root.item) root.right = insert(root.right, value);

        return root;
    }

    public void traverseInorder(Node node) {
        DFS dfs = new DFS();
        dfs.traverseInorder(node);
    }
}
