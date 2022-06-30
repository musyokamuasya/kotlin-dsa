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
    fun push(value: T): LinkedList<T>{
        head = Node(value =value, next = head)
//    Check if there is no value at the tail, tail value will be the head value
        if(tail == null){
            tail = head
        }
    size ++
    return this
    }
    /**
     * Add to the end of the list
     * */
    fun append(value: T){
//        Since for an empty list append is same as push, just call push method
        if (isEmpty()){
            push(value)
            return
        }
//        Add a new node to the tail. The new insertion becomes the new tail, and the former tail is the new next to former tail
        tail?.next = Node(value=value)
        tail = tail?.next
        size ++
    }

    /**
     * Insert node at a particular index
     *
     * The process involves two steps
     * 1. Iterating to find position where the new node will be inserted
     * 2. Adding the value to the node
     * */
    fun pointIdentification (index: Int): Node<T>?{
//        Starting at head node at index zero because we have to start there!
        var currentNode = head
        var currentIndex =0
        while (
            currentNode != null && currentIndex< index
        )
        {
            currentNode = currentNode.next
            currentIndex ++
        }
        return currentNode
    }
    fun insert(value: T, afterNode: Node<T>):Node<T>{
//       Similar to append
        if(tail == afterNode){
            append(value)
        }
//      Create a new node and link to the other node
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size ++
        return newNode
    }

    /**
     * Removing data follows similar trend as adding. Uses pop, removeLast and removeAfter methods
     * */
    fun pop():T?{
//        Check if the list is not empty, and remove from the head
        if (!isEmpty()) size --
        val result = head?.value
//        The head shifts to new head
        head = head?.next
//If the list is empty, there is no tail
        if (isEmpty()){
            tail =null
        }
        return result
    }
}


fun main(){
    val linkedList = LinkedList<Int>()
    val node4 = linkedList.push(4).push(7).push(2)
    val node5 = linkedList.append(6)
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3


    println(node4)
    println(node5)
    println(node1)
}