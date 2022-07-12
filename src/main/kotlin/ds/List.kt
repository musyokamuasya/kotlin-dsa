package ds

/**
 * This is just a description of lists. Nothing much
 * */

fun main(){
    val list: List<Int?> = listOf(1, 2,3, null, 4, 5, 6)
    anotherList()
}

fun anotherList(){
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add(0, "Hello index 0")
    for (number in mutableList){
        println(number)
    }
}