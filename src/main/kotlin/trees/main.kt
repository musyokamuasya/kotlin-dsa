package trees

import trees.basic.TreeNode

fun main() {
// Testing trees
    val hotNode = TreeNode<String>("Hot")
    val coldNode = TreeNode<String>("Cold")
    val beverages = TreeNode<String>("Beverages").apply {
        add(hotNode)
        add(coldNode)
    }
}