package collections.operations.maps

/**
 * Applies a number of lambda functions to an element and returns a list of lambda results
 * */
fun main(){
    val numbers = setOf<Int>(1, 2, 3, 4, 5)
    val byThree = numbers.map { it*3 }
    println(byThree)

    val odd = numbers.mapNotNull { if ((it *3 )/ 2 == 0) null else it }
    println(odd)
}