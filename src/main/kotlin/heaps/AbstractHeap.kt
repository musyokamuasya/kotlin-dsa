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
//      append element to the array
        elements.add(element)
//      Swap the current node with its parent as long as the element has a higher priority than its parent
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
//      Check whether the element has higher priority than the parent
        while (child > 0 && compare(elements[child], elements[parent]) > 0){
//      Swap until the element is positioned correctly in the tree
        Collections.swap(elements, child, parent)
            child = parent
            parent = parentIndex(child)
         }
    }
}