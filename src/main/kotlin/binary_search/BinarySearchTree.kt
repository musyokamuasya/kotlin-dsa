package binary_search

import trees.binary.BinaryNode

/**
 * Binary Search
 * Allows fast lookup, insert and removal operations
 * `Rules` -> Item on the left is less than the root node
 *         -> Item on the right is greater than/ Equal to root node
 *  Removes the needs of doing unnecessary checks
 *  Contains O(log n)
 **/
class BinarySearchTree <T : Comparable<T>>(){
//    Ensure the values in the binary search tree are comparable
    var root : BinaryNode<T>? = null
    override fun toString(): String = root?.toString() ?: "Empty tree"

    fun insert(value : T){
        root = insert(root, value)
    }

    private fun insert (
        node: BinaryNode<T>?,
        value: T) : BinaryNode<T>?{
//        If the root is empty, add the node to the root node
        node?: BinaryNode(value)
//      When the value is less than the node value, inset on the left
        if (node != null) {
            if (value < node.value){
                node.leftChild = insert(node.leftChild, value)
            }
            else{
    //      When the value is greater/ equal to node value, insert on the right
                node.rightChild = insert(node.rightChild, value)
            }
        }

        return node
    }

//    Find value in the node
    fun containsValue(value: T): Boolean{
        var found = false
        root?.inOrderTraversal {
            if (value == it){
                found = true
            }
        }
        return false
    }
}