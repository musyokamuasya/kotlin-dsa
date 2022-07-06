package sorting.linear

fun main(){
    val array = listOf(8, 63, 9, 3, 109, 53, 42)
    println("Original list $array")
    val result = array.mergeSort()
    println("Final list $result")
}

//Splitting
fun <T: Comparable<T>> List<T>.mergeSort(): List<T>{
    /**
     * @MergeSort
     * Works by first splitting the array into singular numbers
     * */
    if (this.size < 2) return this
    val middle = this.size/2
    val left = this.subList(0, middle).mergeSort()
    val right = this.subList(middle, this.size).mergeSort()
    return merge(left, right)
}
/**
 * @MergeSort
 * Second function merges the lists into one large list
 * */
private fun <T: Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
//    Implementation comes here
    var rightIndex = 0
    var leftIndex = 0
    val list = mutableListOf<T>()
    while (leftIndex < left.size && rightIndex < right.size){
        val leftElement = left[leftIndex]
        val rightElement = right[rightIndex]

        if (leftElement < rightElement){
            list.add(leftElement)
            leftIndex += 1
        }

        if (leftElement > rightElement){
            list.add(rightElement)
            rightIndex +=1
        } else{
            list.add(leftElement)
            leftIndex += 1

            list.add(rightElement)
            rightIndex += 1
        }
        if (leftIndex <left.size){
            list.addAll(left.subList(leftIndex, left.size))
        }
        if (rightIndex < right.size){
            list.addAll(right.subList(rightIndex, right.size))
        }
    }
    return list
}

