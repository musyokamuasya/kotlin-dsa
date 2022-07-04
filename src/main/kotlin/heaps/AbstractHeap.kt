package heaps

abstract class AbstractHeap <Element>(): Heap<Element> {
    abstract fun compare(a: Element, b: Element): Int
}