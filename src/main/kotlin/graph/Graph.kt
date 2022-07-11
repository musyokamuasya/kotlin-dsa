package graph

interface Graph<T> {
    fun createVertex(data: T): Vertex<T>

    fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?)

    fun addUnDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?)

    fun addEdge(edgeType: EdgeType, source: Vertex<T>, destination: Vertex<T>, weight: Double?)

    fun edges(source: Vertex<T>): ArrayList<Edge<T>>

    fun weight(source: Vertex<T>, destination: Vertex<T>): Double?
}