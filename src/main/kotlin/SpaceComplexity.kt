fun main(){
    sortedList(listOf(5, 3, 8, 9, 0, 6, 1, 4, 14, 2))
}
fun sortedList(numbers: List<Int>){
    /**
     * Handles the issues of memory allocation
     * Using library specific sorting algorithm
    * */
    val sortedNumbers = numbers.sorted()
    for(number in sortedNumbers){
        println(number)
    }
}