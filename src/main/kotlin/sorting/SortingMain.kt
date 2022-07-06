package sorting.bubble

fun main(){
    val list = arrayListOf<Int>(1, 2, 8, 3, 10, 6, 9,0, 4, 5, 7)
    println("Original list $list")
    list.bubbleSort(true)
    println("Bubble sorted $list")
}
