package leetcode.bit_manipulation

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val hashSet = mutableSetOf<Int>()
        for(num in nums){
            if (hashSet.count() == 1){
                return num
            }
        }
        return -1
    }
}