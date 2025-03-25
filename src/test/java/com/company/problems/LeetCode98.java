package com.company.problems;

import java.util.ArrayList;
import java.util.List;
/* https://leetcode.com/problems/validate-binary-search-tree/ */
public class LeetCode98 {

    public static void main(String[] args) {
        LeetCode98 leetcode = new LeetCode98();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(leetcode.isValidBST(root));
        System.out.println(leetcode.isValidBST2(root));
    }

    public boolean isValidBST(TreeNode root) {
        // traverseInorder (LNR)
        List<Integer> sortedVal = new ArrayList<>();
        traverseInorder(root, sortedVal);
        System.out.println(sortedVal);
        // check element in array sort acs => true
        for (int i = 1; i < sortedVal.size(); i++) {
            if (sortedVal.get(i) <= sortedVal.get(i - 1)) return false;
        }
        return true;
    }

    private void traverseInorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        traverseInorder(node.left, result);
        result.add(node.val);
        traverseInorder(node.right, result);
    }

    // way 2 using prev
    private TreeNode prev;
    private boolean isValidBST2(TreeNode root) {
        if (root == null) return true;

        if(!isValidBST2(root.left)) return false;
        if(prev != null && prev.val > root.val) return false;
        prev = root;
        return isValidBST2(root.right);
    }
}
