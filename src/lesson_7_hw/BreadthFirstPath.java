package lesson_7_hw;

import java.util.Arrays;
import java.util.LinkedList;

public class BreadthFirstPath {

        private boolean[] marked;
        private int[] edgeTo;
        private int[] distTo;
        private int source;
        private final int INFINITY = Integer.MAX_VALUE;

        public BreadthFirstPath(Graph g, int source) {
            this.source = source;
            marked = new boolean[g.getVertexCount()];
            edgeTo = new int[g.getVertexCount()];
            distTo = new int[g.getVertexCount()];

            Arrays.fill(distTo, INFINITY);

            bfs(g, source);
        }

        private void bfs(Graph g, int source) {
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(source);
            marked[source] = true;
            distTo[source] = 0;
            while (!queue.isEmpty()){
                int vertex = queue.removeFirst();
                for (int w : g.getAdjList(vertex)) {
                    if(!marked[w]){
                        marked[w] = true;
                        edgeTo[w] = vertex;
                        queue.addLast(w);
                    }
                }
            }
        }

        public boolean hasPathTo(int v) {
            return marked[v];
        }

        public LinkedList<Integer> pathTo(int v) {
            if (!hasPathTo(v)) {
                return null;
            }
            LinkedList<Integer> stack = new LinkedList<>();
            int vertex = v;
            while (vertex != source){
                stack.push(vertex);
                vertex = edgeTo[vertex];
            }
            return stack;
    }

    public int distTo(int v) {
            return distTo[v];
    }


}