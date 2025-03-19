package com.company.data_structures.tree_base_dsa;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 5);
        bst.insert(bst.root, 3);
        bst.insert(bst.root, 8);
        bst.insert(bst.root, 2);
        bst.insert(bst.root, 4);
        bst.insert(bst.root, 10);

        System.out.println("\nBST Inorder traverse ");
        bst.traverseInorder(bst.root);
    }
}
