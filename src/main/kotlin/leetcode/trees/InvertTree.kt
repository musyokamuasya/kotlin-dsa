package leetcode.trees

import leetcode.trees.node.TreeNode

class InvertTree {

    /**
     * Function to invert a binary tree
     * Maintain the root node
     * Swap the items on the right of tree to the left of the tree
     *
     * Use Recursion
     * */
    fun invertTree(root: TreeNode?): TreeNode? {

        if(root == null) return null
        val node: TreeNode = TreeNode(root.value)

        node.rightNode = invertTree(root.leftNode)
        node.leftNode = invertTree(root.rightNode)

        node.value = root.value

        return node
    }
}