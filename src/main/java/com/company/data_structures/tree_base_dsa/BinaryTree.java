package com.company.data_structures.tree_base_dsa;

public class BinaryTree {
    // Root of binary tree
    Node root;

    public BinaryTree() {
        root = null;
    }

    /*Pre order traversal
        1.Visit root node
        2. Visit all the nodes in the left subtree
        3. Visit all the nodes in the right subtree.
     */
    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        display(node);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    /*
    * InOrder traversal
    * First, visit all the nodes in the left
    * Then visit the root node
    * After that visit all the right nodes.
    * */
    public void inOrderTraversal(Node node) {
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left);
        display(node);
        inOrderTraversal(node.right);
    }

    /*
    * PostOrder traversal
    * Visit all the  nodes in the left
    * Visit all the nodes in the right
    * Visit the root node.
    * */
    public void postOrderTraversal(Node node) {
        if(node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        display(node);
    }
    public void display(Node node) {
        System.out.print(node.item + "->");
    }
}
