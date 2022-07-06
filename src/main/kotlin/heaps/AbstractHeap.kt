package heaps

import java.util.*
import kotlin.collections.ArrayList

abstract class AbstractHeap <Element>(): Heap<Element> {
    var elements: ArrayList<Element> = ArrayList<Element>()
    override val count: Int
        get() = elements.size
    abstract fun compare(a: Element, b: Element): Int

    override fun peek(): Element? {
        return elements.first()
    }

    override fun insert(element: Element) {
        elements.add(element)
        siftUp(count -1)
    }

    private fun rightChildindex(index: Int) = (2 * index ) + 1
    private fun leftChildIndex(index: Int) = (2 * index ) + 2
    private fun parentIndex(index: Int) = (index - 1)/2

//    Add element to the heap
    private fun siftUp(index: Int){
//    Get reference to child for tracking
        var child = index
        var parent = parentIndex(child)
        while (child > 0 && compare(elements[child], elements[parent]) > 0){
        Collections.swap(elements, child, parent)
            child = parent
            parent = parentIndex(child)
         }
    }
}