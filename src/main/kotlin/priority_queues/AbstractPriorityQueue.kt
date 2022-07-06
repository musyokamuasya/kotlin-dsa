package priority_queues

import heaps.Heap
import queues.QueueInterface

/**
 * @Priority Queues
 * Using abstract classes to manage comparisons using the two heap implementation methods already defined
 * */
abstract class AbstractPriorityQueue<T>: QueueInterface<T> {
    abstract val heap: Heap<T>
        get

    override fun dequeue(): T? = heap.remove()

    override val count: Int
        get() = heap.count

    override fun enqueue(item: T): Boolean {
       heap.insert(item)
        return true
    }

    override fun peek(): T? = heap.peek()
}