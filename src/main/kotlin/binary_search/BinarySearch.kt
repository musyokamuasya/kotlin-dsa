package binary_search

/**
 * @Definition
 * Index manipulation at constant time
 * Use array and arraylist to do the operation
 * Collection must be sorted
 **/
// Create a function that is accessible globally
fun <T: Comparable<T>> ArrayList<T>.binarySearch(value: T, range: IntRange = indices) : Int?{
    if (range.first > range.last){
        return null
    }
//    The range is the last value minus initial value +1 eg, range of 5 to 10 is 10-5 +1
    val size = range.last - range.first + 1
//    Middle value is half of range, plus where the range started
    val middle = range.first + size/2
    return when{
//       If the value searching for is at the middle, return the middle as the value
        this[middle] ==value -> middle

        this[middle] > value -> binarySearch(value, range.first until middle)
        else -> binarySearch(value, (middle+1)..range.last)
    }

}