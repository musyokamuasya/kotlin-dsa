package ds

/**
 * Store a collection of key-value pairs
 * The first value is the key, and second value is the value of the corresponding key
 * Each key is unique
 * */

fun findHashSet (nums: IntArray): Boolean{
    val hashSet = mutableSetOf<Int>()
    for (num in nums){
        if (hashSet.contains(num))
            return true
    }
    return false
}

fun main(){

}

