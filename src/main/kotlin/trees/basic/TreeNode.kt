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

    fun makeBeveragesTree(){

    }
}
/**
 * Type alias gives another name to a class/object.
 * Mostly used when you do not want to use the actual name of the object, or the name is long
 * */
typealias Visitor<T> = (TreeNode<T>) -> Unit