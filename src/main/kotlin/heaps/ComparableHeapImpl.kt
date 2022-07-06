package heaps
/**
 * The stack formula is 2i + 1 for the left child, and 2i + 2 for the right child
 **/
class ComparableHeapImpl <Element : Comparable<Element>> : AbstractHeap<Element>(){

    companion object{
        fun <Element: Comparable<Element>> create(
            elements: ArrayList<Element>
        ): Heap<Element>{
            val heap = ComparableHeapImpl<Element>()
            heap.heapify(elements)
            return (heap)
        }
    }
    override fun compare(a: Element, b: Element): Int {
        return a.compareTo(b)
    }

    override fun peek(): Element? {
        TODO("Not yet implemented")
    }

    override val count: Int
        get() = TODO("Not yet implemented")

    override fun remove(): Element? {
        TODO("Not yet implemented")
    }

    override fun remove(index: Int): Element? {
        TODO("Not yet implemented")
    }

    override fun insert(element: Element) {
        TODO("Not yet implemented")
    }
}