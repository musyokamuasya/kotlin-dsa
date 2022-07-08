package leetcode

/**
 *
 * */

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

    // Pointers to array
    var i = 0
    var j = 0

    // Identified medians
    var m1 = 0
    var m2 = 0

    // iterate upto - (m+n)/2
    for (k in 0..(nums1.size+nums2.size)/2) {
        // caching previous value
        m1 = m2
        if (i == nums1.size) {
            // First array ran out of elements, pick second
            m2 = nums2[j]
            j++
        } else if (j == nums2.size) {
            // Second array ran out of elements, pick first
            m2 = nums1[i]
            i++
        } else if (nums1[i] < nums2[j]) {
            // First array element is lower
            m2 = nums1[i]
            i++
        } else {
            // Second array element is lower
            m2 = nums2[j]
            j++
        }
    }

    // For even numbers avg of m1 & m2, m2 otherwise
    return if ((nums1.size+nums2.size)%2 == 0) {
        (m1 + m2) / 2.0
    } else m2.toDouble()
}