package com.example.bankapp.graph;

import java.util.List;

public class GraphResponseBody {
    private String msg;
    private List<Vertex> vertices;
    private List<Edge> edges;
    private List<Edge> shortestPath;

    public List<Vertex> getResult() {
        return vertices;
    }

    public void setResult(List<Vertex> result) {
        this.vertices = result;
    }

    public List<Edge> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Edge> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public String getMsg() { // this will respond to a Object.msg call on the client-side.
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> result) {
        this.vertices = result;
    }
}
