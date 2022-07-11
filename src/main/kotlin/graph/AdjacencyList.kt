package graph

class AdjacencyList<T>: Graph<T> {
    private val adjacencies: HashMap<Vertex<T>, ArrayList<Edge<T>>> = HashMap()
    /**
     * Helper method to print string and directions
     * */
    override fun toString(): String {
        return buildString { 
            adjacencies.forEach {  (vertex, edge) ->
                val edgeString = edge.joinToString {
                    it.destination.data.toString()
                }
                append("${vertex.data} ----->[ $edgeString \n]")
            }
        }
    }

    override fun createVertex(data: T): Vertex<T> {
//        Create a new vertex and return it
        val vertex = Vertex(adjacencies.count(), data)
        adjacencies[vertex] = ArrayList()
        return vertex
    }

    override fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        val edge = Edge(source, destination, weight)
        adjacencies[source]?.add(edge)
    }

    override fun addUnDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        /**
         * The undirected edge is viewed as bidirectional graph
         * The source and the destination can always swap
         * */
        addDirectedEdge(source, destination, weight)
        addDirectedEdge(destination, source, weight)
    }

    override fun addEdge(edgeType: EdgeType, source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        when(edgeType){
            EdgeType.DIRECTED -> addDirectedEdge(source, destination, weight)
            EdgeType.UNDIRECTED -> addUnDirectedEdge(source, destination, weight)
        }
    }
    /**
     * Return an array of edges or an empty array
     * */
    override fun edges(source: Vertex<T>) = adjacencies[source]?: arrayListOf()

    override fun weight(source: Vertex<T>, destination: Vertex<T>): Double? {
        return edges(source).firstOrNull{
            it.destination ==destination
        }?.weight
    }
}