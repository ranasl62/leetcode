import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge {
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class DisjointSet {
    int[] parent;
    int[] rank;

    public DisjointSet(int size) {
        parent = new int[size];
        rank = new int[size];
        makeSet();
    }

    public void makeSet() {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[yRoot] < rank[xRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[xRoot] = yRoot;
            rank[yRoot]++;
        }
    }
}

class Graph {
    int V;
    List<Edge> edges;

    public Graph(int V) {
        this.V = V;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
    }

    public List<Edge> getMinimumSpanningTree() {
        List<Edge> mst = new ArrayList<>();
        DisjointSet ds = new DisjointSet(V);

        // Sort edges in ascending order of weight
        Collections.sort(edges, (a, b) -> a.weight - b.weight);

        for (Edge edge : edges) {
            int sourceRoot = ds.find(edge.source);
            int destRoot = ds.find(edge.destination);

            if (sourceRoot != destRoot) {
                mst.add(edge);
                ds.union(sourceRoot, destRoot);
            }
        }

        return mst;
    }
}

public class MinimumSpanningTreeKruskalDisjoint {

    public static void main(String[] args) {
        int V = 7; // Number of vertices
        Graph graph = new Graph(V);

        // Add edges to the graph
        graph.addEdge(0, 2, 1);
        graph.addEdge(0, 1, 2);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 6, 2);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 1);
        graph.addEdge(5, 6, 3);

        List<Edge> mst = graph.getMinimumSpanningTree();

        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }
    }

}
