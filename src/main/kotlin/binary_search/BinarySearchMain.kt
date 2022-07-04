package binary_search

fun main(){
    val array = arrayListOf<Int>(1, 2, 3, 5, 7, 12, 14, 17, 26, 29, 30, 31, 36, 49, 64, 87, 171, 181, 900)
    val binarySearch = array.binarySearch(171)
    println(binarySearch)
}
