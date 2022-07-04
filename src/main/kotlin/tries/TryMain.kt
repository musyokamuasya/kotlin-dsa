package tries

fun main(){
    val trie = Try<Char>()
//    Insert cute to the try as list
    val word = "cute"
    trie.insert(word.toList())
    if (trie.contains(word.toList())){
        println("The trie contains $word")
    }
}