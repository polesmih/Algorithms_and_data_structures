package lesson_7_hw;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(7,8);
        graph.addEdge(1,3);


        System.out.println(graph.getVertexCount());

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 7);
        System.out.println(bfp.distTo(4));
        System.out.println(bfp.distTo(3));
    }
}