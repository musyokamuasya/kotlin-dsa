package trees.binary
/**
 * Binary trees are the foundation of many data structures and algorithms
 * It provides the best algorithms for node traversals
 **/
typealias Visitor <T> = (T) ->Unit
class BinaryNode<T>(val value: T) {
    var leftChild : BinaryNode<T>? = null
    var rightChild : BinaryNode<T>? = null

    /**
     * In Order Traversal
     * Recursively visits the left node, then the parent and then the right node
     * It is an example that prints the nodes in ascending order
     **/
    fun inOrderTraversal (visitor: Visitor<T>) {
        leftChild?.inOrderTraversal(visitor)
        visitor(value)

        rightChild?.inOrderTraversal(visitor)
    }

    /**
     * Pre-Order Traversal
     * Visits the current node first
     * Recursively visits the left and right node
     *
     **/
    fun preOrderTraversal (visitor: Visitor<T>) {
        visitor(value)
        leftChild?.preOrderTraversal(visitor)
        rightChild?.preOrderTraversal(visitor)
    }

    /**
     * Serialization problem is solved using binary traversals
     * Serialization converts an object into another data type. Allows custom data types to be used in the process
     * For example, in JSON -> Involves finding a way of serializing a binary tree into a list, and a list back to a binary tree
     * Pre - order traversal can be used in the process
     **/
    fun preOrderTraversalWithNull (visitor: Visitor<T>) {
        visitor(value)
        leftChild?.preOrderTraversalWithNull(visitor)
        rightChild?.preOrderTraversalWithNull(visitor)
    }

    /**
     * Actual serialization
     * Store the values in an array
     * The serialization returns the values from the node in an array
     **/

    fun serialize(node: BinaryNode<T> = this): MutableList<T?>{
        val list = mutableListOf<T?>()
        node.preOrderTraversalWithNull { list.add(it) }
        return list
    }

    /**
     * Post-Order Traversal
     * Recursively visit the left and right node
     * Visit the current node after the child node has been visited
     **/
    fun postOrderTraversal (visitor: Visitor<T>) {
        leftChild?.postOrderTraversal(visitor)
        rightChild?.postOrderTraversal(visitor)
        visitor(value)
    }


}

fun buildBinaryTree(): BinaryNode<Int> {
    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val five = BinaryNode(5)
    val seven = BinaryNode(7)
    val eight = BinaryNode(8)
    val nine = BinaryNode(9)

    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five

    seven.leftChild = nine
    nine.rightChild = eight

    return seven
}