package ds

/**
 * This is just a description of lists. Nothing much
 * */

fun main(){
    val list: List<Int?> = listOf(1, 2,3, null, 4, 5, 6)

    println(list.subList(fromIndex = 1, toIndex = 4))
    println(list.size)
    println("First element is ${list[0]}")
    println("Last element is ${list[list.size -1]}")
    println("Reversed list ${list.reversed()}")

}