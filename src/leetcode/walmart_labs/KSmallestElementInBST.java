package leetcode.walmart_labs;

public class KSmallestElementInBST {
    /**
     * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
     */


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int counter = 0;
    int value;

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return value;
    }

    private void inOrderTraversal(TreeNode node, int k) {
        if (node != null) {
            inOrderTraversal(node.left, k);
            counter++;
            if (counter == k) {
                value = node.val;
                return;
            }
            inOrderTraversal(node.right, k);
        }
    }
}
