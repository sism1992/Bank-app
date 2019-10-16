package com.example.bankapp.graph;

import java.util.*;

public class Dijkstra {

    private PriorityQueue<Vertex> queue = new PriorityQueue<>();
    private Map<Vertex,Vertex> backTrack = new HashMap<>();
    public List<Edge> runDijkstra(Vertex v1, Vertex v2, Graph<Vertex> graph){

        Set<Vertex> markSet = new HashSet<>();
        queue.add(v1);
        v1.setLengthFromStart(0);
        while (!queue.isEmpty()){
            Vertex current = queue.poll();
            markSet.add(current);  // den er markeret nu.
            for (Vertex neighbor : graph.adjencyList.get(current).keySet()){
                int initialWeight = graph.adjencyList.get(current).get(neighbor);
                if(current.getLengthFromStart() + initialWeight <
                        neighbor.getLengthFromStart()){
                    neighbor.setLengthFromStart(current.getLengthFromStart() + initialWeight);
                    backTrack.put(neighbor, current);
                }
                if(!markSet.contains(neighbor)){
                    queue.add(neighbor);
                }
            }
        }

        // Udskriv kortest vej:
        List<Edge> shortestPath = new ArrayList<>();
        Vertex vrtx=v2;
        while(vrtx!=v1){
            Edge edge = new Edge<>();
            edge.setV2(vrtx);
            vrtx=backTrack.get(vrtx);
            edge.setV1(vrtx);
            shortestPath.add(edge);
        }
        return shortestPath;

    }

}
