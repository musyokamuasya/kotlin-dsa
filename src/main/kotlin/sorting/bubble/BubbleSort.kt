package sorting.bubble

/**
 * @Bubblesort
 *
 * Sorting algorithm with O(n) average case and O(n^2) worst case
 * Repeatedly compares adjacent values and swaps them
 * */

fun <T: Comparable<T>> ArrayList<T>.bubbleSort(showPasses: Boolean = false){
//    1 or 2 values do not require sorting
    if (this.size < 2) return
//    A single pass will place the largest element at the far end
    for (end in (1 until this.size).reversed()){
        var swapped = false
//      Compare every element to check if it is sorted
        for (current in 0 until end){
//            Swap if needed
            if (this[current] > this[current+1]){
                this.swapAt(current, current + 1)
                swapped = true
            }
        }
        if (showPasses){
            println(this)
        }
        if (swapped) return
    }
}