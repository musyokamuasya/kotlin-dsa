package sorting.square.insertion

import sorting.bubble.swapAt

/**
 * @InsertionSort
 * Shift the values to the left until they reach their optimal positions
 * */
fun <T: Comparable<T>>ArrayList<T>.insertionSort(showPasses: Boolean = false){
//    If the number is less than 2, no sorting
    if (this.size < 2) return
//
    for (current in 1 until this.size){
        for (shifting in (1..current).reversed()){
            if (this[shifting] < this[shifting -1]){
                this.swapAt(shifting, shifting-1)
            }
            else break
        }
    }
    if (showPasses) println(this)
}