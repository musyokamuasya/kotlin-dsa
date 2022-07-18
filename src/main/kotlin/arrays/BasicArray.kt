package arrays

import kotlin.Array

/**
 * Playing around with arrays
 * 1. Operations
 * 2. Dynamic Arrays
 * 3. Immutable Arrays
 * 4. Multidimensional Arrays and their Operations
 * 5. Strings and related operations
 * */

class Array <T> private constructor(){
//    val size: Int
//    operator fun get(index : Int) : T
//    operator fun set(index: Int, value: T): Unit
//    operator fun iterator: Iterable<T>

/**
 * Different array initialization methods
 * */

//    Inferred string type
    val friends = arrayOf("Ken", "Keith", "Ana", "Mary", "Cate")

//    Inferred of type any
    val person = arrayOf("Musyoka", 23, "josephmuasya8@gmail.com", 3.8)

//    Creating a signed array
    val person2: Array<String> = arrayOf("Musyoka","23", "josephmuasya8@gmail.com", "3.8")

    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    val odd: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    val squares = arrayOf(50, {i: Int -> i*i})
}

