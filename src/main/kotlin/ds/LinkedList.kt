package ds

/**
 * Have advantage of constant time data entry and removal + good performance over arraylist
 *
 * */

/**
 * Define a data class to hold the node (With both the value and reference to next node)
* */
data class Node<T>(var value:T, var next: Node<T>? = null){
    override fun toString(): String {
        return if (next != null){
        "$value -> ${next.toString()}"
        }
        else{
            "$value"
        }
    }
}

fun main(){
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)
}