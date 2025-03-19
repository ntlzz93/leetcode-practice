package com.company.data_structures.tree_base_dsa;

public class BFSExampleTest {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.root = new Node(1);
        bfs.root.left = new Node(2);
        bfs.root.right = new Node(3);
        bfs.root.left.left = new Node(4);
        bfs.root.left.right = new Node(5);
        bfs.root.right.right = new Node(6);

        System.out.println("\nLevel order traverse ");
        bfs.levelOrderTraversal(bfs.root);
    }
}
