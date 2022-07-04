package tries

fun main(){
    val trie = Try<Char>().apply {
        insert("car".toList())
        insert("card".toList())
        insert("care".toList())
        insert("cared".toList())
        insert("cars".toList())
        insert("carbs".toList())
        insert("carapace".toList())
        insert("cargo".toList())
    }

    val withCar = trie.collections("car".toList())
    println(withCar.toString())
}