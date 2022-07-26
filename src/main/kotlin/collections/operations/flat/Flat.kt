package collections.operations.flat

/**
 * Flattening process creates a singe array from nested arrays
 * */

fun main(){
    val nums = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println("This is normal nested array")
    println(nums)
    println("This is flat array")
    val flatNums = nums.flatten()
    println(flatNums)
}
