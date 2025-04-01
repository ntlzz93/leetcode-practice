package com.company.problems;

import org.junit.Test;

import static com.company.problems.BFS.disPlay;

public class LeetCode701 {

    @Test
    public void test701_1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        TreeNode result = insertIntoBST(root, 5);
        disPlay(result);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if(val < root.val) root.left = insertIntoBST(root.left, val);
        if(val > root.val) root.right = insertIntoBST(root.right, val);
        return root;
    }
}
