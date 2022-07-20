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

    fun addFirst(element: E){
        val h = head
        val newNode = Node<E>(element, h)
        head = newNode

        if (h == null){
            tail = newNode
        }
        size ++
    }

}