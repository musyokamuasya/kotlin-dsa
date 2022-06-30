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

/**
 * The above method is hard to create and manage linked list.
 *
 * Ideal method involves using a class to manage the linkedlist
 * */
class LinkedList <T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    private  fun isEmpty(): Boolean{
        return size ==0
    }

    override fun toString(): String {
        if (isEmpty()){
            return "List is empty"
        }
        return head.toString()
    }
//    Push method to add values at the tail of the linkedlist
    fun push(value: T){
        head = Node(value =value, next = head)
//    Check if there is no value at the tail, tail value will be the head value
        if(tail == null){
            tail = head
        }
    }
}

fun main(){
    val linkedList = LinkedList<Int>()
    val node4 = linkedList.push(4)
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3


//    println(node4)
    println(node1)
}