package collections.interfaces

import ds.Node

/**
 * Iterable - provides sequential access through an iterator
 * Collection - an iterable that provides additional functionality
 * Mutable Iterable - An iterable which allows for mutation of values
 * Mutable Collection - A collection which allows for mutation of the collection ie alter the collection
 * */

class LinkedList <T> :Iterable<T>{
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0
    private set

    private fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "List is empty"
        }
        return head.toString()
    }

    override fun iterator(): Iterator<T> {
        return LinkedListIterator(this)
    }
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
}

class LinkedListIterator <T> (
    private val linkedList: LinkedList<T>
        ): Iterator<T>{
    private var index = 0
//    Last node helps us keep track of our nodes
    private var lastNode: Node<T>? = null
//    Indicates whether the list has more to iterate
    override fun hasNext(): Boolean {
        return index < linkedList.size
    }
//    Reads the value of nodes
    override fun next(): T {
        if (index >= linkedList.size) throw IndexOutOfBoundsException()
        lastNode = if (index == 0){
            linkedList.pointIdentification(0)
        } else{
            lastNode?.next
        }
        index ++
        return lastNode!!.value
    }
}