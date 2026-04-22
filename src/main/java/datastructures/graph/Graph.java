package datastructures.graph;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(Vertex label) {
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }

    public void addEdge(Vertex label1, Vertex label2) {
        adjVertices.get(label1).add(label2);
        adjVertices.get(label2).add(label1);
    }

    public List<Vertex> getAdjVertices(Vertex label) {
        return adjVertices.get(label);
    }

    public Set<Vertex> dfs(Vertex root) {
        Set<Vertex> visited = new LinkedHashSet<>();
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : getAdjVertices(vertex)) {
                    stack.push(v);
                }
            }
        }
        return visited;
    }

    public void dfsUsingStack(Vertex start) {
        Stack<Vertex> toVisit = new Stack<>();
        toVisit.push(start);

        while(!toVisit.isEmpty()) {
            Vertex current = toVisit.pop();
            if(!current.isVisited()) {
                current.visit();
                System.out.print(current + ", ");
            }

            List<Vertex> neighbours = getAdjVertices(current);
            for(Vertex neighbour: neighbours){
                if(!neighbour.isVisited()) {
                    toVisit.push(neighbour);
                }
            }
        }
    }

    public void dfsRecursion(Vertex current) {
        current.visit();
        System.out.print(current + ", ");
        List<Vertex> neighbours = getAdjVertices(current);
        if(neighbours == null) {
            return;
        }
        for(Vertex vertex : neighbours) {
            if(!vertex.isVisited()) {
                dfsRecursion(vertex);
            }
        }
    }

    public Set<Vertex> bfs(Vertex root) {
        Set<Vertex> visited = new LinkedHashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            for (Vertex v : getAdjVertices(vertex)) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
        return visited;
    }



    public void bfsUsingQueue(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Vertex current = queue.poll();
            if(!current.isVisited()) {
                current.visit();
                System.out.print(current + ", ");
            }
            List<Vertex> neighbours = getAdjVertices(current);
            for (Vertex neighbour: neighbours) {
                if(!neighbour.isVisited()) {
                    queue.add(neighbour);
                }

            }
        }
    }

    public void bfsUsingRecursion(Vertex root) {

    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjVertices=" + adjVertices +
                '}';
    }
}
