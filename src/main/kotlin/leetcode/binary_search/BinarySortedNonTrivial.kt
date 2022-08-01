package leetcode.binary_search

/**
 * @leetcode 33
 *
 * The non-trivial approach uses binary search to check for elements
 * */
class BinarySortedNonTrivial {
    /**
     * General formula for binary search
     * */
    fun binarySearch(numArray: IntArray, target: Int):Int{
        var start: Int = 0
        var end: Int = numArray.size -1
        while (start <= end){
            val mid = (start + (end - start))/2

            if (numArray[mid] > target){
                start = mid+1
            }

            if(numArray[mid] < target){
                end = mid -1
            }

            if (numArray [mid] == target){
               return mid
            }
        }
        return -1
    }
}