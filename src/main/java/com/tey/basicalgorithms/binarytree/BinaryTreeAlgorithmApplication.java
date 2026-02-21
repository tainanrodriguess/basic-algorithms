package com.tey.basicalgorithms.binarytree;

import com.tey.basicalgorithms.binarytree.domain.BinaryTreeTraversal;
import com.tey.basicalgorithms.binarytree.domain.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.tey.basicalgorithms.binarytree.domain.TreeNode.createCompleteTree;

@SpringBootApplication
public class BinaryTreeAlgorithmApplication {

    public static void main(String[] args) {
        int n = 15;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        TreeNode root = createCompleteTree(arr, 0);

        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        System.out.print("Pre-order: (Root-Left-Right) ");
        tree.preorder(root);
        System.out.println();

        System.out.print("In-order: (Left-Root-Right) ");
        tree.inorder(root);
        System.out.println();

        System.out.print("Post-order: (Left-Right-Root) ");
        tree.postorder(root);
        System.out.println();

        System.out.print("Pre-order: (Level-Order) ");
        tree.levelOrder(root);
        System.out.println();
    }
}
