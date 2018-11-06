package leetcode.walmart_labs;

public class RemoveDuplicatedFromSortedArray {

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/*/
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int counter = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                nums[counter++] = nums[i];
            }
        }
        return counter;
    }
}
