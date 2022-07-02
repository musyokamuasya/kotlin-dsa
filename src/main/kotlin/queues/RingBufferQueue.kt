package queues

class RingBufferQueue <T>(size: Int) : QueueInterface<T>{
    override fun enqueue(item: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun dequeue(): T? {
        TODO("Not yet implemented")
    }

    override fun peek(): T? {
        TODO("Not yet implemented")
    }

    override val count: Int
        get() = TODO("Not yet implemented")
}