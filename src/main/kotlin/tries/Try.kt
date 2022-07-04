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
/**
 * Checking if trie contains particular elements
 * Recursively check if that element is in the key
 * */
    fun contains(list: List<Key>):Boolean{
        var current = root
        list.forEach { element->
            val child = current.children[element] ?: return false
            current = child
        }
        return current.isTerminating
    }
/**
 * @Remove elements from a trie
 * Check that it exists using the contains logic
 * Check whether it has child elements
 * Remove
 * -----------------------------------------------
 * */
   fun collections(prefix : List<Key>): List<List<Key>>{
//    Get reference to the root node
        var current = root
//    Check if the element exists
    prefix.forEach {element ->
        val child = current.children[element] ?: return emptyList()
        current = child

    }
    return collections(prefix, current)
   }
/**
 * Create a mutable list to hold your data
 * For every node child, you recursively add it to the collection
 **/
    private fun collections(prefix: List<Key>, node: TryNode<Key>?):List<List<Key>>{
        val results = mutableListOf<List<Key>>()

        if (node?.isTerminating == false){
            results.add(prefix)
        }
        node?.children?.forEach {(key, node) ->
            results.addAll(collections(prefix + key, node))
        }
        return results
    }
}