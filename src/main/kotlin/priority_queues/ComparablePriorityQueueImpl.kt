package priority_queues

import heaps.ComparableHeapImpl
import heaps.Heap

class ComparablePriorityQueueImpl<T: Comparator<T>> : AbstractPriorityQueue<T>(){
    //    override val heap = ComparableHeapImpl<T>()
    override val heap: Heap<T>
        get() = TODO("Not yet implemented")
}