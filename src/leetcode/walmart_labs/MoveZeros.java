package leetcode.walmart_labs;

public class MoveZeros {
    /*
    * https://leetcode.com/problems/move-zeroes/*/
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
