package ds

/**
 * This is just a description of lists. Nothing much
 * */

fun main(){
    val grains = Grains()
    val veges = Veges("Sukuma", "Kunde", "Kales", "Mchicha")
    println(veges)
}

fun anotherList(){
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add(0, "Hello index 0")
    for (number in mutableList){
        println(number)
    }
}

fun toShowLoops(){
    val list: List<Int?> = listOf(1, 2,3, null, 4, 5, 6)
    var numberCount = 0
    while (numberCount < list.size){
        println("Count number before adding $numberCount")
        numberCount++
        println("Count number after adding is $numberCount" )
    }
}

open class Item(val itemName: String, val itemPrice: Int)

class Fish: Item("Omena", 200){
    override fun toString(): String {
        return itemName
    }
}
class Veges(vararg val type: String): Item("Kales", 100){
    override fun toString(): String {
        return type.joinToString()
    }
}
class Grains: Item("Beans", 120){
    override fun toString(): String {
        return itemName
    }
}
class SoftLife: Item("Mutura", 50){
    override fun toString(): String {
        return itemName
    }
}

class Order(val number: Int){
    private val itemList = mutableListOf<Item>()

    fun addItem(item: Item){
        itemList.add(item)
    }
    fun addAllItems(list : List<Item>){
        itemList.addAll(list)
    }
    fun printOrder(){
        println(itemList)
    }
}