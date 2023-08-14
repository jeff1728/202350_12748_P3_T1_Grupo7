package application;

import java.util.LinkedList;



public class Grafo {
	
	 private int V;
	    private LinkedList<Integer>[] adjList;

	    @SuppressWarnings("unchecked")
	    Grafo(int v) {
	        V = v;
	        adjList = new LinkedList[v];
	        for (int i = 0; i < v; i++) {
	            adjList[i] = new LinkedList<>();
	        }
	    }

	    void addEdge(int v, int w) {
	        adjList[v].add(w);
	        adjList[w].add(v);
	    }

	    void DFS(int v, boolean[] visited) {
	        visited[v] = true;
	        System.out.print(v + " ");
	        for (Integer neighbor : adjList[v]) {
	            if (!visited[neighbor]) {
	                DFS(neighbor, visited);
	            }
	        }
	    }

	    void DFSUtil(int startVertex) {
	        boolean[] visited = new boolean[V];
	        DFS(startVertex, visited);
	    }
}
