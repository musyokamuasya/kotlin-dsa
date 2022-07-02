package trees

import trees.basic.TreeNode
import trees.basic.Visitor
import trees.basic.makeBeveragesTree

fun main() {
// Testing trees
    val hotNode = TreeNode<String>("Hot")
    val coldNode = TreeNode<String>("Cold")
    val beverages = TreeNode<String>("Beverages").apply {
        add(hotNode)
        add(coldNode)
    }
    val treeNode = makeBeveragesTree()
    treeNode.depthFirstTraversal {
        println(it.value)
    }
}