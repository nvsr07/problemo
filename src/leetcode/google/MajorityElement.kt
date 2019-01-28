package leetcode.google

class MajorityElement {
    /**
     * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3
    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2*/

    fun majorityElement(nums: IntArray): Int {
        val elementsCount = mutableMapOf<Int, Int>()
        for (element in nums) {
            elementsCount[element] = elementsCount.getOrDefault(element, 0) + 1
        }
        val averageSize = nums.size / 2

        for ((key, value) in elementsCount) {
            if (value > averageSize) {
                return key
            }
        }
        return 0
    }
}