package trees

import trees.basic.TreeNode
import trees.basic.Visitor
import trees.basic.makeBeveragesTree

fun main() {
// Testing trees
    val treeNode = makeBeveragesTree()
    treeNode.depthFirstTraversal {
        println(it.value)
    }
}