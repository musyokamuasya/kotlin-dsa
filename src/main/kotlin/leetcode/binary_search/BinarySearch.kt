package leetcode.binary_search

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size -1

        while(!nums.isEmpty()){
            val midpoint = (left + (right-left))/2

            if(nums[midpoint] > nums.indexOf(target)){
                right = nums.indexOf(target) -1
            }

            if(nums[midpoint] < nums.indexOf(target)){
                left = nums.indexOf(target) +1
            }

            return nums.indexOf(target)
        }

        return -1
    }
}