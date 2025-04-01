package com.company.data_structures.tree_base_dsa;

public class BinarySearchTree {

    Node root;

    public Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.item) root.left = insert(root.left, value);
        else if (value > root.item) root.right = insert(root.right, value);

        return root;
    }

    public Node delete(Node root, int value) {
        if (root == null) return null;
        if (value == root.item) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.left = delete(root.right, value);
            return root;
        }
        if (value < root.item) {
            root.left = delete(root.left, value);
            return root;
        }
        root.right = delete(root.right, value);
        return root;
    }

    public void traverseInorder(Node node) {
        DFS dfs = new DFS();
        dfs.traverseInorder(node);
    }
}
