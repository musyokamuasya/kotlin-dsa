package arrays

fun main(){
    val array1 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(2, 3, 4),
        arrayOf(5, 6, 7)
    )

    val array2 = arrayOf(
        arrayOf(9, 10, 11),
        arrayOf(12, 16, 5),
        arrayOf(6, 4, 9)
    )

    val m = array1.size
    val n = array1[0].size
    val c = Array(m) { intArrayOf(n) }

    for (i in 0 until m){
        for (j in 0 until n){
            c[i][j] = array1[i][j] * array2[i][j]
            println(c)
        }
    }
}