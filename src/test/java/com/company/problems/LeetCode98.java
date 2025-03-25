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
}
