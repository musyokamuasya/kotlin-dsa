package leetcode
/**
 * Kotlin version of contains duplicate
 * */
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for(num in nums){
            if(set.contains(num)){
                return true
            }
            set.add(num)
        }
        return false
    }
}