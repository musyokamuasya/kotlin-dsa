package trees.basic

class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()
    fun add(child: TreeNode<T>){
        children.add(child)
    }
}
/**
 * Type alias gives another name to a class/object.
 * Mostly used when you do not want to use the actual name of the object, or the name is long
 * */
typealias Visitor<T> = (TreeNode<T>) -> Unit