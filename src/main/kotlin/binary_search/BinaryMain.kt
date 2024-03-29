package binary_search

fun main(){
    val exampleTree = BinarySearchTree<Int>().apply {
        insert(3)
        insert(1)
        insert(4)
        insert(0)
        insert(2)
        insert(5)
    }
    println(exampleTree)

    if (exampleTree.containsValue(5)){
        println("Found 5")
    } else {
        println("5 not found")
    }
}