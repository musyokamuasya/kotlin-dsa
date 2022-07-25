package collections.built_in

fun main(){

    /**
     * Sequence operates lazily
     * Performs all the processing steps one-by-one for every single element
     * */
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val sequence = list.asSequence()

    sequence.forEach {
        println(it)
        }
    }