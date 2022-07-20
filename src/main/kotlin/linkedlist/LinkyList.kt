package linkedlist

/**
 * Another implementation of the LinkedList Data Structure.
 * Each node has reference to the next node
 * A node can hold multiple things, but at least the element and the next element
 * */
class LinkyList <E>{
    private inner class Node<E> constructor(internal var element: E, internal var next: Node<E>?)

    private var size = 0
    private var head: Node<E>? = null
    private var tail: Node<E>? = null

/**
 * Adding the first element checks whether the element
 * There is only one element, so the head is also the tail
 * */

    fun addFirst(element: E){
        val h = head
        val newNode = Node<E>(element, h)
        head = newNode

        if (h == null){
            tail = newNode
        }
        size ++
    }

    fun addLast(element: E){
        val t = tail
        val newNode = Node(element, null)
        tail = newNode

        if (t == null){
            head = tail
        }

        t?.next = newNode
    }

}