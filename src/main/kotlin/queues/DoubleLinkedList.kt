package queues

import collections.interfaces.LinkedList

class DoubleLinkedList <T> : QueueInterface<T> {
    private var doubleLinkedList = doubleArrayOf()
    private var size = 0

    override fun enqueue(item: T): Boolean {
//        doubleLinkedList.
//        Find how to append list to a double linked queue
        return false
    }

    override fun dequeue(): T? {
//        val firstNode = doubleLinkedList.
        return null
    }

    override fun peek(): T? {
        TODO("Not yet implemented")
    }

    override val count: Int
        get() = size
}