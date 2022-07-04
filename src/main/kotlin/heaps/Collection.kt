package heaps

interface Collection <Element> {
    val count : Int
        get

    val isEmpty : Boolean
        get() = count ==0

    fun insert(element: Element)

    fun remove(): Element?

    fun remove(index : Int): Element?
}