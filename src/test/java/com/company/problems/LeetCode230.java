package com.company.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
/* https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/ */
public class LeetCode230 {
    @Test
    public void leetCode230_1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(1, kthSmallest(root, 1));
    }
    @Test
    public void leetCode230_2(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        assertEquals(3, kthSmallest(root, 3));

    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k-1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
