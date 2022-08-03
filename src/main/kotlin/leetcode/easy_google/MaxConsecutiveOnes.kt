package leetcode.easy_google

class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        val n = nums.size
        var counter = 0
        var max = 0
        for (i in 0 until n) {
            if (nums[i] == 1) {
                counter++
            } else {
                if (counter > max) {
                    max = counter
                }
                counter = 0
            }
        }
        if (counter > max) {
            max = counter
        }
        return max
    }
}