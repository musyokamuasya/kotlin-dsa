package tries

class Try<Key> {
    private val root = TryNode<Key>(key = null, parentNode = null)

    /**
     * @Insert
     * Takes a lists and maps to a series of nodes
     * Each item in the list represents a node in the try tree
     *
     * @since I don't I understand how this insertion process works. I assume it adds a complete letter,
     * in which you have to add all the values iteratively
    **/

    fun insert(list: List<Key>){
//        Keep track of the list
        var current = root
//        Store each element in a different node
        list.forEach{element ->
            if (current.children[element] == null){
                current.children[element] = TryNode(element, current)
            }
            current = current.children[element]!!
        }
        //    The last node should be marked as the end of the node
      current.isTerminating = true
    }

    fun contains(list: List<Key>):Boolean{
        var current = root
        list.forEach { element->
            val child = current.children[element] ?: return false
            current = child
        }
        return current.isTerminating
    }
}