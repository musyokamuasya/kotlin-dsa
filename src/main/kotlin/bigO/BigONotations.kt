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
       val time = measureTimeMillis {
            getAllNames(listOf("Kenya", "Tanzania", "Uganda", "Namibia", "Lesotho", "South Africa"))
        }
        print(time)
    }

