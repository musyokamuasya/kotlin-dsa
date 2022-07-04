package tries
/**
 * Tree that builds a prefix matching
 * Used for searching words
 * Form a word by going through a series of characters from root node to the final node
 * A black dot is used to indicate the terminator
 **/
class TryNode <Key> (var key: Key?, var parentNode: TryNode<Key>?){
    var children : HashMap<Key, TryNode<Key>> = HashMap()
    var isTerminating = false
}