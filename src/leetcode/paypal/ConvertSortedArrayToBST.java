package leetcode.paypal;

public class ConvertSortedArrayToBST {
    /**
     *
     * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
     *
     * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     *
     * Example:
     *
     * Given the sorted array: [-10,-3,0,5,9],
     *
     * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5*/

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }

        return generate (0, nums.length - 1, nums);
    }

    TreeNode generate(int low, int high, int [] nums){
        if(low > high){
            return null;
        }
        int mid = ((high - low ) / 2) + low;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = generate(low, mid - 1, nums);
        node.right = generate(mid + 1, high, nums);
        return node;
    }
}
