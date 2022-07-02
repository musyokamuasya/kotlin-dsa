package queues

interface Queue <T> {
    fun enqueue(item: T) : Boolean

    fun dequeue(): T?

    fun peek(): T?

    val count: Int
        get

    val isEmpty : Boolean
        get() = count == 0
}