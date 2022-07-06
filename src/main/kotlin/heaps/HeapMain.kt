package heaps

fun main(){
    val array = arrayListOf<Int>(1, 3, 4, 8, 77, 236, 969, 2867, 9238, 7867, 57290, 99772, 367878, 972828, 3984628, 968626, 832724)
    val priorityQueue = ComparableHeapImpl.create(array)
    while (!priorityQueue.isEmpty){
        println(priorityQueue.remove())
    }
}