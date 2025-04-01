package com.company.problems;

import org.junit.Test;

import static com.company.problems.BFS.disPlay;

public class LeetCode450 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        disPlay(root);
        deleteNode(root, 3);
        disPlay(root);
    }

    public TreeNode deleteNode(TreeNode root, int value) {
      // TODO implement here
        return root;
    }

    public TreeNode findMin(TreeNode node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }
}
