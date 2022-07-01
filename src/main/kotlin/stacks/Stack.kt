package stacks

/**
 * Enforces how data is accessed
 * Implemented in several data structures
 * Android uses stack in fragments -> Help pop in and out
 * Memory Allocation
 * Search and conquer algorithms
 * */

//ArrayList makes sense in stacks because they offer constant time read and writes
class Stack(size: Int){
    private var stackSize = size
    private var stackArr = IntArray(stackSize)
    private var top = -1
// Push method to add items to the stack
    fun push(){
    }
//    Pop method to get items from the stack
    fun pop(){

    }
//    Size method returns the total number of items
    fun size(){

    }
//    Peek method looks at item at a particular position
    fun peek(){

    }
}