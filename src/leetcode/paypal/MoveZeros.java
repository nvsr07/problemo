package leetcode.paypal;

public class MoveZeros {
    /**
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * Example:
     *
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Note:
     *
     * You must do this in-place without making a copy of the array.
     * Minimize the total number of operations.
     * */

    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                moveLeft(i, nums);
            }
        }
    }
    private void moveLeft(int i, int[] nums){
        if(i - 1 >= 0 && nums[i - 1] == 0){
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1]= temp;
            moveLeft(i - 1, nums);
        }
    }
}
