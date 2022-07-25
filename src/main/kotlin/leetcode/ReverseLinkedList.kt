package leetcode

import java.util.LinkedList


/**
 * Reverse linked list using two common methods used to reverse a list
 * Using recursion
 * Two pointer method. The method below is for a two-pointer
 * */
class ReverseLinkedList<T> {
    fun reverseList(head: LinkedList<T>?): LinkedList<T>? {
        return rev(head, null)
    }

    fun rev(node: LinkedList<T>?, pre: LinkedList<T>?): LinkedList<T>? {
        if (node == null) return pre
        val temp: LinkedList<T> = node.next
        node.next = pre
        return rev(temp, node)
    }
}