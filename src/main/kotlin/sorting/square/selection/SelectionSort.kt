package sorting.square

import sorting.bubble.swapAt
/**
 * @SelectionSort
 * Performs sorting in all elements
 * Starts with the smallest element, then to the second smallest element until the second last element
 *
 * */
fun <T: Comparable<T>> ArrayList<T>.selectionSort(
    showPasses: Boolean = false
){
    if (this.size < 2) return

    for(current in 0 until (this.size -1)){
        var lowest = current

        for (other in (current + 1) until this.size){
            if (this[lowest] > this[other]){
                lowest = other
            }
        }
        if (lowest != current){
            this.swapAt(lowest, current)
        }
        if (showPasses) println(this)
    }

}