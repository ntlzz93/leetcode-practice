package com.company.data_structures.tree_base_dsa;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    Node root;

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.item + " -> ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}
