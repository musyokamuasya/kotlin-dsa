package queues

fun main () {
    val arrayQueue = ArrayListQueue<Int>()
    arrayQueue.enqueue(6)
    arrayQueue.enqueue(7)
    arrayQueue.enqueue(8)
    arrayQueue.enqueue(9)

    println(arrayQueue.peek())

    println(arrayQueue)
}