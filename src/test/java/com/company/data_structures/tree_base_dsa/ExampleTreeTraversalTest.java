package com.company.data_structures.tree_base_dsa;

public class ExampleTreeTraversalTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(12);
        binaryTree.root.right = new Node(9);
        binaryTree.root.left.left = new Node(5);
        binaryTree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        binaryTree.inOrderTraversal(binaryTree.root);

        System.out.println("\nPreorder traversal ");
        binaryTree.preOrderTraversal(binaryTree.root);

        System.out.println("\nPostorder traversal");
        binaryTree.postOrderTraversal(binaryTree.root);

        DFS dfs = new DFS();
        dfs.root = new Node(1);
        dfs.root.left = new Node(2);
        dfs.root.right = new Node(3);
        dfs.root.left.left = new Node(4);
        dfs.root.left.right = new Node(5);
        dfs.root.right.right = new Node(6);

        System.out.println("\nPreorder traverse ");
        dfs.traversePreorder(dfs.root);

        System.out.println("\nInorder traverse ");
        dfs.traverseInorder(dfs.root);

        System.out.println("\nPostorder traverse ");
        dfs.traversePostorder(dfs.root);

    }
}
