package heaps

class CompareToHeapImpl <Element>(private val comparator : Comparator<Element>): AbstractHeap<Element>(){
    override fun compare(a: Element, b: Element): Int {
        return compare(a, b)
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