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
        value: T) : BinaryNode<T>{
//        If the root is empty, add the node to the root node
        node ?: return BinaryNode(value)
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
        return found
    }
    /**
     * Uses binary search to look up for values in the binary tree
     * The space and big O complexity is 0(log n)
     * */
    fun optimizedContains (value: T):Boolean{
        var current = root
        while (current != null){
            if (current.value == value){
                return true
            }
        }

//        current = if (value < current.value){
//
//        } else{
//
//        }
        return false
    }


    private fun removeNode(node: BinaryNode<T>?, value: T):BinaryNode<T>?{
        node ?: return null
        when{ value == node.value ->{
//            Empty node
            if (node.leftChild == null && node.rightChild == null){
                return null
            }

            if (node.leftChild == null){
                return node.rightChild
            }

            if (node.rightChild == null){
                return node.leftChild
            }

            node.rightChild?.min?.value?.let {
                node.value == it
            }
        }
            value < node.value -> node.leftChild = removeNode(node.leftChild, value)
            else -> node.rightChild = removeNode(node.rightChild, value)
        }

        return node

    }
/** This function does not work as expected*/
//    fun removeNode(value: T){
//        root = removeNode(node, value)
//    }

}