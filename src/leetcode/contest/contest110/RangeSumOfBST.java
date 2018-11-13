package leetcode.contest.contest110;

public class RangeSumOfBST {


    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        traverseAndFind(root, L, R);
        return sum;
    }

    void traverseAndFind(TreeNode root, int L, int R) {
        if (root != null) {
            traverseAndFind(root.left, L, R);
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            traverseAndFind(root.right, L, R);
        }

    }

}
