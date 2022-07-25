package collections.built_in

fun main(){
//    Create a doubly-linked list using iterator
    val nums = listOf<String>("One","Two","Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Zero")

    val numbers = nums.listIterator()
    while (numbers.hasNext()){
        numbers.next()
        println("Printing forward ${numbers.toString()}")
    }
}