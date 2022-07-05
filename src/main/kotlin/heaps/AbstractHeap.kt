package heaps

abstract class AbstractHeap <Element>(): Heap<Element> {
    var elements: ArrayList<Element> = ArrayList<Element>()
    override val count: Int
        get() = elements.size
    abstract fun compare(a: Element, b: Element): Int

    override fun peek(): Element? {
        return elements.first()
    }

    private fun rightChildindex(index: Int) = (2 * index ) + 1
    private fun leftChildIndex(index: Int) = (2 * index ) + 2
    private fun parentIndex(index: Int) = (index - 1)/2

}