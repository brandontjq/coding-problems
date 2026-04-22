package datastructures.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void ableToInstantiateGraph() {
        Graph graph = new Graph();
        assertNotNull(graph);
    }

    @Test
    void ableToAddVertexToGraph() {
        Graph graph = new Graph();
        graph.addVertex(new Vertex("A"));
        System.out.println(graph);
    }

    @Test
    void ableToAddEdge() {
        Graph graph = new Graph();
        Vertex a =  new Vertex("A");
        Vertex b =  new Vertex("B");
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addEdge(a, b);
        System.out.println(graph);
    }

    @Test
    void dfs() {
        Graph graph = new Graph();


        Vertex a =  new Vertex("A");
        Vertex b =  new Vertex("B");
        Vertex c =  new Vertex("C");
        Vertex d =  new Vertex("D");
        Vertex e =  new Vertex("E");
        Vertex f =  new Vertex("F");
        Vertex g =  new Vertex("G");
        Vertex h =  new Vertex("H");
        Vertex i =  new Vertex("I");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);
        graph.addVertex(h);
        graph.addVertex(i);

        graph.addEdge(a,b);
        graph.addEdge(b,d);
        graph.addEdge(b,e);
        graph.addEdge(d,f);
        graph.addEdge(e,f);
        graph.addEdge(a,c);
        graph.addEdge(c,g);
        graph.addEdge(g,h);
        graph.addEdge(h,i);

        System.out.println(graph);
        System.out.println(graph.dfs(a));
        graph.dfsUsingStack(a);
    }

    @Test
    void dfsUsingRecursion() {
        Graph graph = new Graph();

        Vertex a =  new Vertex("A");
        Vertex b =  new Vertex("B");
        Vertex c =  new Vertex("C");
        Vertex d =  new Vertex("D");
        Vertex e =  new Vertex("E");
        Vertex f =  new Vertex("F");
        Vertex g =  new Vertex("G");
        Vertex h =  new Vertex("H");
        Vertex i =  new Vertex("I");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);
        graph.addVertex(h);
        graph.addVertex(i);

        graph.addEdge(a,b);
        graph.addEdge(b,d);
        graph.addEdge(b,e);
        graph.addEdge(d,f);
        graph.addEdge(e,f);
        graph.addEdge(a,c);
        graph.addEdge(c,g);
        graph.addEdge(g,h);
        graph.addEdge(h,i);

        System.out.println(graph);
        graph.dfsRecursion(a);
    }

    @Test
    void dfsUsingBFS() {
        Graph graph = new Graph();

        Vertex a =  new Vertex("A");
        Vertex b =  new Vertex("B");
        Vertex c =  new Vertex("C");
        Vertex d =  new Vertex("D");
        Vertex e =  new Vertex("E");
        Vertex f =  new Vertex("F");
        Vertex g =  new Vertex("G");
        Vertex h =  new Vertex("H");
        Vertex i =  new Vertex("I");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);
        graph.addVertex(h);
        graph.addVertex(i);

        graph.addEdge(a,b);
        graph.addEdge(b,d);
        graph.addEdge(b,e);
        graph.addEdge(d,f);
        graph.addEdge(e,f);
        graph.addEdge(a,c);
        graph.addEdge(c,g);
        graph.addEdge(g,h);
        graph.addEdge(h,i);

        System.out.println(graph);
        System.out.println(graph.bfs(a));
        graph.bfsUsingQueue(a);
    }



}