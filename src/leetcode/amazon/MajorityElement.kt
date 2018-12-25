package leetcode.amazon

class MajorityElement {
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