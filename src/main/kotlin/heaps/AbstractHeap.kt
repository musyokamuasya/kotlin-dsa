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

    override fun remove(): Element? {
//        Ensure the heap is not empty
        if (isEmpty) return null
//      If there are elements, perform swap between parent and elements at both i and j positions
        Collections.swap(elements, 0, count-1)
//      Keep the record of the item
        val item = elements.removeAt(count -1)
        siftDown(0)
        return item
    }

    /**
     * Removing at particular index
     * Ensure the item is within the index
     * If you are removing the last item in the index, just remove. Nothing much needed
     * If you are not removing the last index, swap the item with the item in last index
     * Return the item and remove it from the index
     * Perform both sift up and sift down operations
     * */
    override fun remove(index: Int): Element? {
//      If the item is larger than the size of array return null
        if (index >= count) return null
//      If the item is the last item in the list, just remove it
        return if (index == count -1){
            elements.removeAt(index -1)
        } else {
//           If element is inside the array, swap the element with the last element, remove it and sift up and down until well positioned
            Collections.swap(elements, index, count -1)
            val item = elements.removeAt(index -1)
            siftDown(index)
            siftUp(index)
            item
        }
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
/**
 * Basic removes root node from the heap
 * Swap the root node with the last element in the heap
 * Once you remove the root element, store its value so you can return it later
 * Sift down to ensure every parent is larger than equal to the value of the children
 * Start from the parent node and check left and right child
 * Swap the greater value with the parent
 * If both children are greater than parent, swap with the parent
 * */
    private fun siftDown(index: Int){
        var parent = index
        while (true) {
            val left = leftChildIndex(parent)
            val right = rightChildindex(parent)
            var candidate = parent
            if (left < count && compare(elements[left], elements[candidate]) > 0) {
                candidate = left
            }
            if (right < count && compare(elements[right], elements[candidate]) > 0) {
                candidate = right
            }

            if (candidate == parent) {
                return
            }
            Collections.swap(elements, parent, candidate)
            parent = candidate
        }
    }
}