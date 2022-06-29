package bigO


    fun main(args: Array<String>){
        checkFirstNames(listOf("Kenya", "Tanzania", "Uganda", "Namibia", "Lesotho", "South Africa", ))
        checkFirstNames(listOf("USA", "Canada", "GB", "Italy", "France", "Croatia"))
    }
    /**
     * An example of linear function. It works irrespective of the size of the names, since it checks only the first name
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
