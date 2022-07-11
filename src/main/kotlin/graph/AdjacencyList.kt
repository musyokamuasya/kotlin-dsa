package graph

class AdjacencyList<T>: Graph<T> {
    private val adjacencies: HashMap<Vertex<T>, ArrayList<Edge<T>>> = HashMap()

    override fun createVertex(data: T): Vertex<T> {
//        Create a new vertex and return it
        val vertex = Vertex(adjacencies.count(), data)
        adjacencies[vertex] = ArrayList()
        return vertex
    }

    override fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        TODO("Not yet implemented")
    }

    override fun unDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        TODO("Not yet implemented")
    }

    override fun addEdge(edgeType: EdgeType, source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        TODO("Not yet implemented")
    }

    override fun edges(source: Vertex<T>): ArrayList<Edge<T>> {
        TODO("Not yet implemented")
    }

    override fun weight(source: Vertex<T>, destination: Vertex<T>): Double? {
        TODO("Not yet implemented")
    }
}