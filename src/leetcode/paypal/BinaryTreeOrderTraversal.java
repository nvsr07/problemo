package leetcode.paypal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeOrderTraversal {

    /**
     *
     * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     *
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * return its level order traversal as:
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]*/



    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> outerQueue = new ArrayDeque<>();
            if(root != null){
                outerQueue.add(root);
            }

            while(!outerQueue.isEmpty()){
                Queue<TreeNode> innerOuter = new ArrayDeque<>();
                List<Integer> list = new ArrayList<>();
                while(!outerQueue.isEmpty()){
                    TreeNode item = outerQueue.poll();
                    list.add(item.val);
                    if(item.left != null){
                        innerOuter.add(item.left);
                    }
                    if(item.right != null){
                        innerOuter.add(item.right);
                    }
                }
                result.add(list);
                outerQueue = innerOuter;
            }
            return result;
        }
    }
}
