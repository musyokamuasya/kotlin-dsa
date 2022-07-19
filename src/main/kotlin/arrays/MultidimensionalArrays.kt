package arrays

fun multidimensionalArrays() {
    val numbers = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (number in numbers){
        for(item in number){
            println(item)
        }
    }

}

fun main(){
    multidimensionalArrays()
}