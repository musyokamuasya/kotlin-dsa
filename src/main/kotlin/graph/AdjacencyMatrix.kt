package graph
/**
 * Uses square matrix to represent the graph
 * The matrix is a 2-d array
 * The value of the matrix[row][column] is the weight of edge between the vertices at row and column
 *
 *
 * */
class AdjacencyMatrix <T>: Graph<T>{
    private val vertices = arrayListOf<Vertex<T>>()
    private val weights = arrayListOf<ArrayList<Double?>>()

    override fun createVertex(data: T): Vertex<T> {
        val vertex = Vertex(vertices.count(), data)
        vertices.add(vertex)
        weights.forEach{
            it.add(null)
        }

        val row = ArrayList<Double?>(vertices.count())
        repeat(vertices.count()){
            row.add(null)
        }
        weights.add(arrayListOf())
        return vertex
    }


    override fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        weights[source.index][destination.index] = weight
    }

    override fun addUnDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        return
    }

    override fun addEdge(edgeType: EdgeType, source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        TODO("Not yet implemented")
    }

    override fun edges(source: Vertex<T>): ArrayList<Edge<T>> {
        val edges = arrayListOf<Edge<T>>()
        (0 until edges.size).forEach {column ->
            val weight = weights[source.index][column]
            if (weight != null){
                edges.add(Edge(source, vertices[column], weight))
            }

        }
        return edges
    }

    override fun weight(source: Vertex<T>, destination: Vertex<T>): Double? {
        return weights[source.index][destination.index]
    }
}