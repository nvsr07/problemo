package leetcode.google


class AnagramMapping {
    fun anagramMappings(A: IntArray, B: IntArray): IntArray {
        val hashMapping = hashMapOf<Int, Int>()
        val result = IntArray(A.size)
        for(i in 0 until B.size){
            val valueAtIndex = B[i]
            hashMapping[valueAtIndex] = i
        }

        for(i in 0 until  A.size){
            val valueAtIndex:Int = A[i]
            val mapValue:Int = hashMapping[valueAtIndex]?:0
            result.set(i, mapValue)
        }
        return result
    }
}