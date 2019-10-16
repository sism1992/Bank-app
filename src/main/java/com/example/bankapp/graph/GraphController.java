package com.example.bankapp.graph;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

    @Autowired
    GraphService graphService;

    @PostMapping("/api/graph")
    public ResponseEntity<?> getGraph(){
        GraphResponseBody graphResponseBody = new GraphResponseBody();
        graphResponseBody.setVertices(graphService.vertices);
        graphResponseBody.setEdges(graphService.edges);
        graphResponseBody.setShortestPath(graphService.shortestPath);
        graphResponseBody.setMsg("success");
        return ResponseEntity.ok(graphResponseBody);
    }
}
