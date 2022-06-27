package collections

fun main(args: Array<String>) {
/**
* Lists - Ordered collection with access to elements by indices which reflect their position
 * Set - Group of elements without repetition
 * Map - Key value pairs. Uses unique keys which map to only one value
* */
    val names = mutableListOf<String>("Nashon", "Becky", "Esther", "Martha", "Bonke", "Ciox")
    names.add("Mash")
    names.add("Jere")
    names.add("Jeff")
    println(names)
    for (index in names.indices){
        println("Name at index $index is ${names[index]}")
    }
}