package leetcode.trees

import kotlin.math.max

data class Node(val value: Int, val rightNode: Node? = null, val leftNode: Node? = null)

fun maxDepth(root: Node?): Int {
    if(root == null) return 0
/**
 * Use recursion to traverse through the tree, and add 1 everytime you move from one level to another
 * */
    return 1 + max(maxDepth(root.rightNode), maxDepth(root.leftNode))
}
