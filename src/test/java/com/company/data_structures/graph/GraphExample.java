package com.company.data_structures.graph;

public class GraphExample {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,4);

        System.out.println("DFS traversal");
        g.DFS(0);
        g.resetVisit();
        System.out.println("BFS traversal");
        g.BFS(0);
    }
}
