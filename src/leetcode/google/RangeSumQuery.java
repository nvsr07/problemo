package leetcode.google;

public class RangeSumQuery {

    /**
     * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
     *
     * Example:
     * Given nums = [-2, 0, 3, -5, 2, -1]
     *
     * sumRange(0, 2) -> 1
     * sumRange(2, 5) -> -1
     * sumRange(0, 5) -> -3
     * Note:
     * You may assume that the array does not change.
     * There are many calls to sumRange function.
     * */
    private int[] nums;

    public RangeSumQuery(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int beg = 0;
        if (i - 1 >= 0) {
            beg = nums[i - 1];
        }
        return nums[j] - beg;
    }
}
