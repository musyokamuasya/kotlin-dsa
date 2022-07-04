package heaps

interface Heap<Element> : Collection<Element> {
    fun peek(): Element?
}