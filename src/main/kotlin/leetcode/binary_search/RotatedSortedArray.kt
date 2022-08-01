package leetcode.binary_search


/**
 * @Leetcode 33
 *
 * The question has two solutions
 * 1. Trivial solution with O(n) complexity
 *
 * */
class RotatedSortedArray {
//    Trivial Solution
    fun searchTrivial(nums: IntArray, target: Int): Int {
        for(i in nums){
            // Loops through the whole array at O(n) to determine the solution
            if( i == target){
                return nums.indexOf(i)
            }
        }
        return -1
    }
}