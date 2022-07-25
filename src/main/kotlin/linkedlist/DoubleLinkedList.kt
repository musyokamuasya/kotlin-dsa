package linkedlist
data class Node<T>(val value: T, val nextNode: Node<T>, val previousNode: Node<T>)
class DoubleLinkedList <T>{
    private var size = 0
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    /**
     * Common operations
     * 1. Get first element
     * 2. Get last element
     * 3. Remove element at particular index
     * 4. Remove element at first index
     * 5. Remove element at particular index
     * */
}