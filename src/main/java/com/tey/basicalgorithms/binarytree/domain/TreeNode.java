package com.tey.basicalgorithms.binarytree.domain;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode createCompleteTree(int[] arr, int index) {
        if (index >= arr.length) {
            return null;
        }
        TreeNode node = new TreeNode(arr[index]);
        node.left = createCompleteTree(arr, 2 * index + 1);
        node.right = createCompleteTree(arr, 2 * index + 2);
        return node;
    }
}