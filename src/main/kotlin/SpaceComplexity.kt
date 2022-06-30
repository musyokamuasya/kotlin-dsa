import bigO.checkTimeMills

fun main(){
    val time1 = checkTimeMills()
    sortedList(listOf(5, 3, 8, 9, 0, 6, 1, 4, 14, 2))
    goodSorting(listOf(5, 3, 8, 9, 0, 6, 1, 4, 14, 2))
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
/**
 * This algorithm is not very readable, but more memory efficient that the first implementation
 * */
fun goodSorting(numbers: List<Int>){
//    Check if the list is empty
    if(numbers.isEmpty()){
        println("Nothing found")
    }
//    Start a track of current count of print statements made
    var currentCount = 0
//    Store reference to last printed value
    var minValue = Int.MIN_VALUE
//    Print all values matching minimum value and keep the count
    for (number in numbers){
        if (number == minValue){
            println(minValue)
            currentCount += 1
        }
    }
//    Find the minimum value bigger than minimum value
    while (currentCount < numbers.size){
        var currentValue = numbers.maxOrNull()!!
        for(value in numbers){
            if (value <currentValue && value > minValue){
                currentValue = value
            }
        }

        for(value in numbers){
            if (value == currentValue){
                println(value)
                currentCount +=1

            }
        }

        minValue = currentValue
    }
}