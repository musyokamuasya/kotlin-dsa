package sorting.linear

/**
 * @QuickSort
 *
 * Uses similar algorithm as merge sort
 * Chooses three pivot value to which divides the list into 3 partitions
 * Pick the middle element
 * Splits into 3 -> Greater than, Equal to and Less than
 * */

fun <T: Comparable<T>> ArrayList<T>.quickSort(): List<T>{
    if (this.size < 2) return this

    val pivot = this[this.size/2]
    val lessThan = this.filter{it <pivot}
    val greaterThan = this.filter { it > pivot }
    val equalTo = this.filter { it == pivot }

    return this
}