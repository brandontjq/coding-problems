package datastructures.graph;

public class Vertex {
    private String value;
    private boolean visited;

    public Vertex(String value) {
        this.value = value;
        this.visited = false;
    }

    public void visit(){
        this.visited = true;
    }

    public boolean isVisited() {
        return visited;
    }

    @Override
    public String toString() {
        return value;
    }
}
