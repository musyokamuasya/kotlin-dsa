package leetcode

class NumbersInSet {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = mutableSetOf<Int>()
        val set2 = mutableSetOf<Int>()

        for(num in nums1){
            set1.add(num)
        }

        for(num in nums2){
            set2.add(num)
        }

        set1.retainAll(set2)

        return set1.toIntArray()

    }
}