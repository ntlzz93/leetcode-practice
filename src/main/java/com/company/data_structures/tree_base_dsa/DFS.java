package com.company.data_structures.tree_base_dsa;

public class DFS {
    //Preorder (NLR)
    //Inorder (LNR)
    //Postorder (LRN)

    Node root;

    public DFS() {
        this.root = null;
    }

    public DFS(Node root) {
        this.root = root;
    }

    public void traversePreorder(Node node) {
        if (node == null) return;
        System.out.print(node.item + " -> ");
        traversePreorder(node.left);
        traversePreorder(node.right);
    }

    public void traverseInorder(Node node) {
        if (node == null) return;
        traverseInorder(node.left);
        System.out.print(node.item + " -> ");
        traverseInorder(node.right);
    }

    public void traversePostorder(Node node) {
        if (node == null) return;
        traversePostorder(node.left);
        traversePostorder(node.right);
        System.out.print(node.item + " -> ");
    }
}

