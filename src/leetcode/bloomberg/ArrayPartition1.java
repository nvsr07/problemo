package leetcode.bloomberg;

import java.util.Arrays;

public class ArrayPartition1 {

    /**
     * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
     *
     * Example 1:
     * Input: [1,4,3,2]
     *
     * Output: 4
     * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
     * Note:
     * n is a positive integer, which is in the range of [1, 10000].
     * All the integers in the array will be in the range of [-10000, 10000].
     * */

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length / 2; i++){
            int index = 2*i;
            result += nums[index];
        }

        return result;
    }
}
