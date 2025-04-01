package com.company.problems;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1382 {

    static List<Integer> nodes = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        inorder(root);
        BFS.disPlay(buildAVL(0, nodes.size() - 1));
    }

    private static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        nodes.add(root.val);
        inorder(root.right);
    }

    private static TreeNode buildAVL(int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nodes.get(mid));
        root.left = buildAVL(left, mid - 1);
        root.right = buildAVL(mid + 1, right);
        return root;
    }
}
