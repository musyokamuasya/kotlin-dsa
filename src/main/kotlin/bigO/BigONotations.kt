package bigO

import kotlin.system.measureTimeMillis


fun main(args: Array<String>){
    checkTimeMills()

    //        checkFirstNames(listOf("Kenya", "Tanzania", "Uganda", "Namibia", "Lesotho", "South Africa", ))
    //        checkFirstNames(listOf("USA", "Canada", "GB", "Italy", "France", "Croatia"))
    }
    /**
     * An example of constant function. It works irrespective of the size of the names, since it checks only the first name
     *
     * No matter the size of the list, it prints the first name
     * */
    fun checkFirstNames(names: List<String>){
        if (names.firstOrNull() != null){
            println(names.first())
        }
        else
        {
            println("No names")
        }
    }
    /**
     * An example of linear function. Represented by big-O 0(n)
     * */
    fun getAllNames(names: List<String>){
        for(name in names){
            println(name)
        }
    }

    /**
     * An example of quadratic time notation. Takes the time complexity square of the input
     **/
    fun multiplicationTable(size: Int){
        for(firstNumber in 1..size){
            for (secondNumber in 1..size){
                println(firstNumber*secondNumber)
            }
        }
    }

    /**
     * Logarithmic time leverages some shortcuts and uses some methods to test only a subset of data needed
     **/
    fun logarithmicExample(value: Int, numbers: List<Int>): String{
        if(numbers.isEmpty()){
            return "No $value found"
        }
        val middleIndex = numbers.size/2
        if(value <= middleIndex){
        // Look for the number in lower indices
            for (index in 0..middleIndex){
                if (numbers[index] == value){
                    println(value)
                    return "Value is $value"
                }
            }
        }
        else {
            // Look for number in upper indices
            for (index in middleIndex..numbers.size){
                if (numbers[index] == value){
                    println(value)
                    return "Value is $value"
                }
            }
        }

        return "Value was not found"
    }

//Check the time the function runs in milliseconds

    fun checkTimeMills (){
//        val time1 = measureTimeMillis {
//            checkFirstNames(listOf("Kenya", "Tanzania", "Uganda", "Namibia", "Lesotho", "South Africa"))
////            checkFirstNames(listOf("USA", "Canada", "GB", "Italy", "France", "Croatia"))
//        }
//        println(time1)
//        val time2 = measureTimeMillis {
////            checkFirstNames(listOf("Kenya", "Tanzania", "Uganda", "Namibia", "Lesotho", "South Africa"))
//            checkFirstNames(listOf("USA", "Canada", "GB", "Italy", "France", "Croatia"))
//        }
//        println(time2)


//        Linear function
//       val time = measureTimeMillis {
//            getAllNames(listOf("Kenya", "Tanzania", "Uganda", "Namibia", "Lesotho", "South Africa"))
//        }
//        println(time)
//        val time2 = measureTimeMillis {
//            multiplicationTable(3)
//        }
//        println(time2)
//
//        val time3 = measureTimeMillis {
//            multiplicationTable(10)
//        }
//        println(time3)
     val logTime = measureTimeMillis {
         logarithmicExample(3, listOf(1,2,3,4,5,6,7,7,8,8,9,10,28,64,642,649, 993, 6353))
     }
        println(logTime)

    }

