package queues

class ArrayListQueue<T> : QueueInterface<T> {
//Initiate the array list
    private val arrayList = arrayListOf<T>()
//    Add item to the top of the queue. Doesn't matter whether the queue had items or it was null
    override fun enqueue(item: T): Boolean {
        arrayList.add(item)
        return true
    }
//    Remove items from the queue. Check whether the list is empty at first
    override fun dequeue(): T? =
        if (isEmpty) null else arrayList.removeAt(0)
//  Check if there is item at index zero. Peek returns the item without mutating it
    override fun peek(): T? = arrayList.getOrNull(0)
//  Returns the total number of items
    override val count: Int
        get() = arrayList.size
//  Make it easy to work with the array
    override fun toString(): String = arrayList.toString()
}