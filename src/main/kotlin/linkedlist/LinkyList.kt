package linkedlist




/**
 * Another implementation of the LinkedList Data Structure.
 * Each node has reference to the next node
 * A node can hold multiple things, but at least the element and the next element
 * */
class LinkyList <E>{
    private inner class Node<E> constructor(internal var element: E, internal var next: Node<E>?)

    private var size = 0
    private var head: Node<E>? = null
    private var tail: Node<E>? = null

/**
 * Adding the first element checks whether the element
 * There is only one element, so the head is also the tail
 * */

    fun addFirst(element: E){
        val h = head
        val newNode = Node<E>(element, h)
        head = newNode

        if (h == null){
            tail = newNode
        }
        size ++
    }

    fun addLast(element: E){
        val t = tail
        val newNode = Node(element, null)
        tail = newNode

        if (t == null){
            head = tail
        }

        t?.next = newNode

        size ++
    }

    /**
     * Inserting node at a given index
     * Get reference to the node at the given index
     * The previous element would be the tail, and next node to previous will be the new next.
     *
     * */
    fun insertAt(index: Int, element: E){
        if (index <0 || index > size){
            throw IndexOutOfBoundsException()
        }
//        If the index is at the top, just insert as inserting to tail
        var x = head
        val previousIndex = index -1
        val nextIndex = index + 1
        for (i in 0 until previousIndex){
            x = x!!.next
        }

        val newNode = Node(element, null) // This is wrong
    }

//    Function to add all elements to the linked list
        fun <T> addAll(index: Int, array: Array<T>): Boolean where T: E{
    //    Check if the number is less than index, or whether it is larger than the size of the array
        if (index <0 || index >= array.size){
            throw IndexOutOfBoundsException()
        }
        if (array.isEmpty()) return false
            val previous: Node<E>?
            val nextNode: Node<E>?

            when(index){
                0 -> {
                    previous = null
                    nextNode = head
                    }
                size -> {
                    previous = tail
                    nextNode = null
                }
                else ->{
//                    Configure the next and previous nodes
//                    previous =
//                    nextNode = previous.next
                }
            }
            return true
        }
}