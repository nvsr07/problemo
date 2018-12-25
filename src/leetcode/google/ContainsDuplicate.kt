package leetcode.google
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        for (i in 0 until nums.size - 1){
            for (y in i + 1 until nums.size){
                if (nums[i] == nums[y]) return true
            }
        }
        return false
    }
}