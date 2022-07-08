package leetcode


/**
 * Leetcode #3 -> Intermediate
 * We want code that gives the largest substring in a string
 * Max() = 0
 * Max(aaaa) = 1
 * Max(musyokamuasya) =7
 *
 * Two methods: Brute force which uses nested for loops to determine the solution
 * Sliding window
 *
 * Brute force is not a great implementation - It has O(n^3) which is not desirable for longer strings
 *
 * Sliding window -> Limits revisiting same node several times
 * The whole idea is to find the maximum difference between indices which have the same values
 *
 * You can test it on your end
 * */
 fun lengthOfLongestWord(string: String): Int{
//    Have a pointer for the starting point
    var start = 0
//    The maximum value before duplication
    val max = 0
// Check occurrence of a value in the string
    val occurrence = mutableMapOf<Char, Int>()

    for((index, character) in string.withIndex()){
        if (occurrence.containsKey(character)){
            val seekPoint = occurrence[character]!!+1
            start = Math.max(seekPoint, start)
        }

        val length = index - start + 1
        occurrence[character] = index
    }
    return max
 }