package trees.binary
/**
 * Binary trees are the foundation of many data structures and algorithms
 * It provides the best algorithms for node traversals
 **/
typealias Visitor <T> = (T) ->Unit
class BinaryNode<T>(val value: T) {
    var leftChild : BinaryNode<T>? = null
    var rightChild : BinaryNode<T>? = null
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