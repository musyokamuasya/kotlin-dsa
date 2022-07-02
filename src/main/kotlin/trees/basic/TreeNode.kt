package trees.basic

class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()
    fun add(child: TreeNode<T>){
        children.add(child)
    }

   /**
    * Depth first Traversal (DFT)
    * Starts at the root node and traverses the tree as far as possible along each branch
    * Once it reaches the leaf it starts backtracking
    *
    **/
    fun depthFirstTraversal(visitor: Visitor<T>){
       visitor(this)
       children.forEach(){
           it.depthFirstTraversal(visitor)
       }
    }

}
/**
 * Type alias gives another name to a class/object.
 * Mostly used when you do not want to use the actual name of the object, or the name is long
 * */
typealias Visitor<T> = (TreeNode<T>) -> Unit

fun makeBeveragesTree(): TreeNode<String>{
    val tree = TreeNode("Beverages")
    val hot = TreeNode("Hot")
    val cold = TreeNode("Cold")
    val coffee = TreeNode("Coffee")
    val tea = TreeNode("Tea")
    val chocolate = TreeNode("Chocolate")
    val blackTea = TreeNode("Black tea")
    val greenTea = TreeNode("Green Tea")
    val chaiTea = TreeNode("Chai Tea")
    val soda = TreeNode("Soda")
    val milk = TreeNode("Milk")
    val juice = TreeNode("Juice")
    val lemon = TreeNode("Lemon")
    val mango = TreeNode("Mango")
    val strawberry = TreeNode("Strawberry")

    tree.add(hot)
    tree.add(cold)
    hot.add(coffee)
    hot.add(chocolate)
    hot.add(tea)
    cold.add(soda)
    cold.add(juice)
    cold.add(milk)
    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)
    juice.add(lemon)
    juice.add(mango)
    juice.add(strawberry)

    return tree
}