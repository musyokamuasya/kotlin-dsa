package collections.operations.zip

/**
 * Creates pairs from elements in similar positions
 * Returns a list of pair objects
 *
 * This prints [(Nash, Wilber), (Jeff, Aggrey), (Ciox, Livi), (Njuru, Smith), (Kibi, Wajackoya)]
 * */

fun main(){
    val houses = listOf("Wilber", "Aggrey", "Livi", "Smith", "Wajackoya")
    val students = listOf("Nash", "Jeff", "Ciox", "Njuru", "Kibi")

    println(students zip houses)
}