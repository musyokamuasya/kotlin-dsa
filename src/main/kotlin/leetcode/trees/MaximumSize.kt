package leetcode.trees

import leetcode.trees.node.TreeNode
import kotlin.math.max



fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0
/**
 * Use recursion to traverse through the tree, and add 1 everytime you move from one level to another
 * */
    return 1 + max(maxDepth(root.rightNode), maxDepth(root.leftNode))
}
