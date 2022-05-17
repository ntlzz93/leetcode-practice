package com.company.data_structures.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer> adjList[];
    private boolean visited[];

    public Graph(int vertices) {
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    public void resetVisit() {
        for (int i = 0; i < adjList.length; i++) {
            visited[i] = false;
        }
    }

    public void DFS(int vertex) {
        visited[vertex] = true;
        System.out.println(vertex + " ");
        Iterator<Integer> ite = adjList[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj]) {
                DFS(adj);
            }
        }
    }

    public void BFS(int vertex) {
        LinkedList<Integer> queue = new LinkedList<>();
        visited[vertex] = true;
        queue.add(vertex);
        while (queue.size() != 0) {
            vertex = queue.poll();
            System.out.println(vertex + " ");
            Iterator<Integer> ite = adjList[vertex].listIterator();
            while (ite.hasNext()){
                int adj = ite.next();
                if(!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }
}
