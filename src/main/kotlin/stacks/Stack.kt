package stacks

/**
 * Enforces how data is accessed
 * Implemented in several data structures
 * Android uses stack in fragments -> Help pop in and out
 * Memory Allocation
 * Search and conquer algorithms
 * */
//Stacks provide two main methods, for adding values to the stack, and removing values
interface Stack<Element>{
    fun push (element: Element)
    fun pop(): Element?
}

//ArrayList makes sense in stacks because they offer constant time read and writes
